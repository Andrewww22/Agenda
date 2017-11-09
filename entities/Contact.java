package entities;

public class Contact {

	/*Nume
	//String lastName;
	//*Prenume
	//String firstName;
	//Numar
   // String phoneNumber;
	//*Adresa mail
	//String mail;
	 */

	//String FirstName;
	//String LastName;
	//String MobilePhoneNumber;



	public Contact()
	{
		int cate = 10;
		attributeKey = new String[cate];
		attributeKey[0] = "fistName";
		attributeKey[1] = "lastName";
		attributeKey[2] = "phoneNumber";
		attributeKey[3] = "emailAdress";

		attributeLabel = new String[cate];
		attributeLabel[0] = "Fist Name";
		attributeLabel[1] = "Last Name";
		attributeLabel[2] = "Phone Number";
		attributeLabel[3] = "Email Adress";

		attributeKey = new String[cate];
		attributeKey[0] = "text";
		attributeKey[1] = "text";
		attributeKey[2] = "text";
		attributeKey[3] = "text";
	}
}
