package Hospital_Management;

import java.util.Scanner;

public class fecility implements fecilityInterface
{
    String fec_name;
    @SuppressWarnings("resource")
	public void add_feci()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("fecility:-");
        fec_name = input.nextLine();
    }
    public void show_feci()
    {
        System.out.println(fec_name);
    }
}