import java.util.Scanner;

public class DnD {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Escolha sua raça: \n");
		for(RaceType race : RaceType.values()) {
			System.out.println(race.getId() + " - " + race.getName());
		}
		
		Long raceId = in.nextLong();
		RaceType race = RaceType.getById(raceId);
		System.out.println("Você escolheu ser um: " + race.getName());
		in.close();	
		System.out.println("Por ser um " +race.getName() + " você terá os seguintes atributos: ");
		
		// O Caio preferia que fosse if o Garcia quis switch
		Dragonborn Dragonborn = new Dragonborn();
		AtributoBase AtributoBase = new AtributoBase();
	
		switch(race.name()) {
		case "DRAGONBORN": System.out.println(Dragonborn.strengthBase + AtributoBase.strengthBase);
		break;
		case "HIGHELF": System.out.println("High Elf bixinha");
		break;
		case "LOWELF": System.out.println("High Elf bixinha");
		break;
		case "HUMAN": System.out.println("High Elf bixinha");
		break;
		case "DWARF": System.out.println("High Elf bixinha");
		break;
		case "MOUNTAINDWARF": System.out.println("High Elf bixinha");
		break;
		case "TIEFLING": System.out.println("High Elf bixinha");
		break;
		
		
		
		}
		
		
			
	}
	
}

		