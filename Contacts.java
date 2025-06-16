package projetos.Agenda;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Contacts {
	List<String> listNames = new ArrayList<>();
	List<String> listNumbers = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	private String name;
	private int number;

	public void addContact(String name, String number) {
		System.out.println("Qual é o nome do seu contato?");
		name = scanner.next();
		listNames.add(name);
		System.out.println();
		System.out.println("Qual é o número desse contato?");
		number = scanner.next();
		listNumbers.add(number);
	}

	public void listContacts(int peoples) {
		for (peoples = 0; peoples <= (listNames.size() - 1); peoples++) {
			System.out.println(peoples + 1 + " -- " + listNames.get(peoples) + " -- " + listNumbers.get(peoples));
		}
	}

	public void changeDados(int peoples, int menu, String name, String number) {
		if (listNames.size() > 0) {
			System.out.println("Qual contato você gostaria de editar?");
			System.out.println();
			for (peoples = 0; peoples <= (listNames.size() - 1); peoples++) {
				System.out.println(peoples + 1 + " -- " + listNames.get(peoples));
			}
			peoples = scanner.nextInt();
			peoples--;

			while (menu < 1 || menu > 3) {
				System.out.println("O que você quer editar nesse contato?");
				System.out.println();
				System.out.println("1 - Nome");
				System.out.println("2 - Número");
				System.out.println("3 - Sair");
				menu = scanner.nextInt();
			}
			switch (menu) {
			case 1:
				System.out.println("Qual o nome você gostaria de coloca-lo para alterar?");
				name = scanner.next();
				listNames.set(peoples, name);
				break;
			case 2:
				System.out.println("Qual é o número que você quer colocar para edita-lo?");
				number = scanner.next();
				listNumbers.set(peoples, number);
				break;
			case 3:
				System.out.println("Retornando para a página principal...");
				break;
			}
		} else {
			System.out.println("Você não possui contatos, adicione pelo menos 1 para acessar essa pagina!");
		}
	}

	public void deleteContact(int peoples) {
		if (listNames.isEmpty()) {
			System.out.println("A lista está vazia!");
		} else {
			for (peoples = 0; peoples < listNames.size(); peoples++) {
				System.out.println(peoples + 1 + " -- " + listNames.get(peoples));
			}
			System.out.println();
			while (peoples < 0 || peoples > (listNames.size() - 1)) {
				System.out.println("Selecione o contato que deseja excluir pelo número!");
				peoples = scanner.nextInt();
				peoples--;
			}
			listNames.remove(peoples);
			listNumbers.remove(peoples);
			System.out.println("Contato removido com sucesso!");
		}
	}

	public void comunication(int peoples, int comunication) {
		if(listNames.size() > 0) {
			System.out.println("Seus contatos:");
			System.out.println();
			for (peoples = 0; peoples <= (listNames.size() - 1); peoples++) {
				System.out.println(peoples + 1 + " -- " + listNames.get(peoples));
			}
			System.out.println("Qual contato você deseja se comunicar?");
			comunication = scanner.nextInt();
			if (comunication <= 0 || comunication >= (listNames.size() - 1)) {
				System.out.println("Olá " + listNames.get(comunication - 1) + " como está? Tudo bem?");
			}
		}
	}
}

