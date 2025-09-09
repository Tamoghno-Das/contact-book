import java.util.*;
class ContactImpl
{
	public static void main(String...args)
	{
		List<Contact> contacts = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("-----Contact Book-----");
			 System.out.println("1. Add Contact");
            System.out.println("2. Remove Contact");
            System.out.println("3. Search Contact");
            System.out.println("4. Display All Contacts");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
			
			switch(choice)
			{
				case 1: 
					System.out.println("Enter Your name: ");
					String name = sc.nextLine();
					System.out.println("Enter your Phone Number: ");
					long phoneno = sc.nextLong();
					contacts.add(new Contact(name,phoneno));
					System.out.println("---CONTACT ADDED----");
					break;
					
				case 2: 
					System.out.println("Enter the name to remove the contact: ");
					String removename = sc.nextLine();
					boolean removed = contacts.removeIf(s -> s.name.equalsIgnoreCase(removename));
					if(removed)
					{
						System.out.println("Contact Found!!!");
					}
					else
					{
						System.out.println("Contact Not Found!!!");
					}
					break;
					
				case 3:
					System.out.println("Enter the name for Search the contact: ");
					String searchname = sc.nextLine();
					for(Contact c: contacts)
					{
						if(c.name.equalsIgnoreCase(searchname))
						{
							System.out.println("Contact found");
						}
						else
						{
							System.out.println("Contact not found");
						}
					}
					break;
					
				case 4:
					System.out.println("----ALL CONTACTS----");
					for(Contact c: contacts)
					{
						if(c.name.isEmpty())
						{
							System.out.println("No Contacts Available to display");
						}
							
						else
						{
							contacts.forEach(System.out::println);
						}
					}
					break;
					
				case 5:
					System.out.println("Thank you for using Contact Book");
					sc.close();
					return;
					
				default :
					System.out.println("Wrong Choice");
			}
		}
	}
}
					