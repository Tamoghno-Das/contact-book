class Contact
{
	String name;
	long Phoneno;
	
	public Contact(String name, long Phoneno)
	{
		this.name = name;
		this.Phoneno = Phoneno;
	}
	
    public String toString() 
	{
		return "Name: " + name + ", Phone: " + Phoneno;
	}
}
		