package projetos.Agenda;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Contacts contatos = new Contacts();
		List<String> listNames = new ArrayList<>();
		List<String> listNumbers = new ArrayList<>();

		int menu = 0;
		int peoples = 0;
		int comunication = 0;
		String name = null;
		String number = null;

		while (menu <= 1 || menu >= 6) {
			System.out.println("Lista De Contatos:");
			System.out.println();
			contatos.listContacts(peoples);
			System.out.println();
			System.out.println("'1' - Adicionar contato:");
			System.out.println("'2' - Editar contato:");
			System.out.println("'3' - Comunicar com contato:");
			System.out.println("'4' - Excluir contato:");
			System.out.println("'5' - Sair aplicativo:");
			menu = scanner.nextInt();

			switch (menu) {
			case 1:
				contatos.addContact(name,number);
				menu = -1;
				break;
			case 2:
				contatos.changeDados(menu, peoples, name, number);
				menu = -1;
				break;
			case 3:
				contatos.comunication(peoples,comunication);
				menu = -1;
				break;
			case 4:
				contatos.deleteContact(peoples);
				menu = -1;
				break;
			}
		}
		System.out.println("Obrigado por usar nosso aplicativo de agenda de contatos, até mais!");
	}
}
