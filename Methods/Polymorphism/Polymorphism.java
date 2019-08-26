class Pet {
   
    String petName;
    
    public void setNewName(String newName) {
    	this.petName = newName;
    }
    public void showInfo(String name) {
        System.out.println("This pet is named: " + this.petName);
    }
}

class BigDog extends Pet {
	
    public void showInfo() {
        System.out.println("This big dog is named: " + this.petName);
    
    
}
}

class BigCat extends Pet {
    public void showInfo() {
        System.out.println("This big cat is named: " + this.petName);
    
}
}
public class Polymorphism {

	public static void main(String[] args) {
		
		BigDog doug = new BigDog();
		doug.setNewName("Doug");
		doug.showInfo();
		
		BigCat goud = new BigCat();
		goud.setNewName("Goud");
		goud.showInfo();
	}

}
