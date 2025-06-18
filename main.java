package projetos.Agenda;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		List<Contact> infoContact = new ArrayList();
		Scanner scanner = new Scanner(System.in);

		int menu = 0;
		int index = 0;
		int comunication = 0;
		String name = null;
		String number = null;
		String address = null;

		while (menu <= 1 || menu >= 6) {
			System.out.println("Lista De Contatos:");
			System.out.println();
			for (index = 0; index <= (infoContact.size() - 1); index++) {
				System.out.println(index + 1 + " -- " + infoContact.get(index).getName() + " -- "
						+ infoContact.get(index).getNumber() + " -- " + infoContact.get(index).getAddress());
			}
			System.out.println();
			System.out.println("'1' - Adicionar contato:");
			System.out.println("'2' - Editar contato:");
			System.out.println("'3' - Comunicar com contato:");
			System.out.println("'4' - Excluir contato:");
			System.out.println("'5' - Sair aplicativo:");
			menu = scanner.nextInt();

			switch (menu) {

			case 1:
				addContact(infoContact, scanner);
				menu = -1;
				break;
				
			case 2:
				changeDados(infoContact, scanner);
				menu = -1;
				break;

			case 3:
				comunication(infoContact, scanner);
				menu = -1;
				break;
				
			case 4:
				deleteContact(infoContact, scanner);
				menu = -1;
				break;
			}
		}
		System.out.println("Obrigado por usar nosso aplicativo de agenda de contatos, até mais!");
	}
	
	public static void addContact(List<Contact>infoContact, Scanner scanner) {
		Contact contact = new Contact("indefinido", "indefinido", "indefinido");
		
		String name = null;
		String number = null;
		String address = null;
		
		scanner.nextLine();
		System.out.println("Qual é o nome do desse contato?");
		name = scanner.nextLine();
		contact.setName(name);
		System.out.println();

		System.out.println("Qual é o número desse contato?");
		number = scanner.nextLine();
		System.out.println();
		contact.setNumber(number);
		
		System.out.println("Qual é o endereço desse contato?");
		address = scanner.nextLine();
		contact.setAddress(address);
		System.out.println();

		infoContact.add(new Contact(contact.getName(), contact.getNumber(), contact.getAddress()));
		System.out.println();
	}
	
	public static void changeDados(List<Contact>infoContact, Scanner scanner) {
		
		int index = -1;
		int menu = -1;
		String name = null;
		String number = null;
		String address = null;
		
		
		System.out.println();
		if (infoContact.size() > 0) {
			while (index < 0 || index > (infoContact.size() - 1)) {
				System.out.println("Qual contato você gostaria de editar?");
				System.out.println();
				for (index = 0; index <= (infoContact.size() - 1); index++) {
					System.out.println(index + 1 + " -- " + infoContact.get(index).getName() + " -- "
							+ infoContact.get(index).getNumber() + " -- "
							+ infoContact.get(index).getAddress());
				}

				index = scanner.nextInt();
				index--;
				menu = -1;
			}

			while (menu < 1 || menu > 4) {
				System.out.println("O que você quer editar nesse contato?");
				System.out.println();
				System.out.println("1 - Nome");
				System.out.println("2 - Número");
				System.out.println("3 - Endereço");
				System.out.println("4 - Sair");
				menu = scanner.nextInt();
			}
			switch (menu) {
			case 1:
				scanner.nextLine();
				System.out.println("Qual o nome você gostaria de coloca-lo para alterar?");
				name = scanner.nextLine();
				Contact c = infoContact.get(index);
				c.setName(name);

				break;
			case 2:
				scanner.nextLine();
				System.out.println("Qual é o número que você quer colocar para edita-lo?");
				number = scanner.nextLine();
				Contact d = infoContact.get(index);
				d.setNumber(number);

				break;
			case 3:
				scanner.nextLine();
				System.out.println("Qual é o endereço atual desse contato?");
				address = scanner.nextLine();
				Contact e = infoContact.get(index);
				e.setNumber(address);
				break;
			case 4:
				System.out.println("Retornando para a página principal...");
				break;
			}
		} else {
			System.out.println("Você não possui contatos, adicione pelo menos 1 para acessar essa pagina!");
		}
		System.out.println();
	}
	public static void comunication(List<Contact>infoContact, Scanner scanner) {
		
		int comunication;
		if (infoContact.size() > 0) {
			System.out.println("Seus contatos:");
			System.out.println();
			for (int index = 0; index <= (infoContact.size() - 1); index++) {
				System.out.println(index + 1 + " -- " + infoContact.get(index).getName() + " -- "
						+ infoContact.get(index).getNumber() + " -- " + infoContact.get(index).getAddress());
			}
			System.out.println("Qual contato você deseja se comunicar?");
			comunication = scanner.nextInt();
			if (comunication <= 0 || comunication >= (infoContact.size() - 1)) {
				System.out.println(
						"Olá " + infoContact.get(comunication - 1).getName() + " como está? Tudo bem?");
			}
		}				
		System.out.println();
	}
	public static void deleteContact(List<Contact>infoContact, Scanner scanner) {
		int index;
		if (infoContact.isEmpty()) {
			System.out.println("A lista está vazia!");
		} else {
			for (index = 0; index <= (infoContact.size() - 1); index++) {
				System.out.println(index + 1 + " -- " + infoContact.get(index).getName() + " -- "
						+ infoContact.get(index).getNumber() + " -- " + infoContact.get(index).getAddress());
			}
			System.out.println();
			while (index < 0 || index > (infoContact.size() - 1)) {
				System.out.println("Selecione o contato que deseja excluir pelo número!");
				index = scanner.nextInt();
				index--;
			}
			infoContact.remove(index);
			System.out.println("Contato removido com sucesso!");
		}
		System.out.println();
	}
}
