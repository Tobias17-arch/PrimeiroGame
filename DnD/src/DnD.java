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
		
		// O Caio preferia que fosse if o Garcia quis switch
		Dragonborn Dragonborn = new Dragonborn();
		AtributoBase AtributoBase = new AtributoBase();
		HighElf HighElf = new HighElf();
		LowElf LowElf = new LowElf();
		Human Human = new Human();
		Dwarf Dwarf = new Dwarf();
		MountainDwarf MountainDwarf = new MountainDwarf();
		Tiefling Tiefling = new Tiefling();
		
		 switch(race.name()) {
			case "DRAGONBORN": System.out.println("Seus atributos são: \n" +
			"Strenght: " + (Dragonborn.strengthBase + AtributoBase.strengthBase) + "\n" +
			"Dexterity: " + (Dragonborn.dexterityBase + AtributoBase.dexterityBase) + "\n" +
			"constitution: " + (Dragonborn.constitutionBase + AtributoBase.constitutionBase) + "\n" +
			"intelligence: " + (Dragonborn.intelligenceBase + AtributoBase.intelligenceBase) + "\n" +
			"wisdom: " + (Dragonborn.wisdomBase + AtributoBase.wisdomBase) + "\n" +
			"charisma: " + (Dragonborn.charismaBase + AtributoBase.charismaBase));
				break;
			case "HIGHELF": System.out.println("Seus atributos são: \n" +
			"Strenght: " + (HighElf.strengthBase + AtributoBase.strengthBase) + "\n" +
			"Dexterity: " + (HighElf.dexterityBase + AtributoBase.dexterityBase) + "\n" +
			"constitution: " + (HighElf.constitutionBase + AtributoBase.constitutionBase) + "\n" +
			"intelligence: " + (HighElf.intelligenceBase + AtributoBase.intelligenceBase) + "\n" +
			"wisdom: " + (HighElf.wisdomBase + AtributoBase.wisdomBase) + "\n" +
			"charisma: " + (HighElf.charismaBase + AtributoBase.charismaBase));
				break;
			case "LOWELF": System.out.println("Seus atributos são: \n" +
			"Strenght: " + (LowElf.strengthBase + AtributoBase.strengthBase) + "\n" +
			"Dexterity: " + (LowElf.dexterityBase + AtributoBase.dexterityBase) + "\n" +
			"constitution: " + (LowElf.constitutionBase + AtributoBase.constitutionBase) + "\n" +
			"intelligence: " + (LowElf.intelligenceBase + AtributoBase.intelligenceBase) + "\n" +
			"wisdom: " + (LowElf.wisdomBase + AtributoBase.wisdomBase) + "\n" +
			"charisma: " + (LowElf.charismaBase + AtributoBase.charismaBase));
				break;
			case "HUMAN": System.out.println("Seus atributos são: \n" +
			"Strenght: " + (Human.strengthBase + AtributoBase.strengthBase) + "\n" +
			"Dexterity: " + (Human.dexterityBase + AtributoBase.dexterityBase) + "\n" +
			"constitution: " + (Human.constitutionBase + AtributoBase.constitutionBase) + "\n" +
			"intelligence: " + (Human.intelligenceBase + AtributoBase.intelligenceBase) + "\n" + 
			"wisdom: " + (Human.wisdomBase + AtributoBase.wisdomBase) + "\n" +
			"charisma: " + (Human.charismaBase + AtributoBase.charismaBase));
				break;
			case "DWARF": System.out.println("Seus atributos são: \n" +
			"Strenght: " + (Dwarf.strengthBase + AtributoBase.strengthBase) + "\n" +
			"Dexterity: " + (Dwarf.dexterityBase + AtributoBase.dexterityBase) + "\n" +
			"constitution: " + (Dwarf.constitutionBase + AtributoBase.constitutionBase) + "\n" +
			"intelligence: " + (Dwarf.intelligenceBase + AtributoBase.intelligenceBase) + "\n" +
			"wisdom: " + (Dwarf.wisdomBase + AtributoBase.wisdomBase) + "\n" +
			"charisma: " + (Dwarf.charismaBase + AtributoBase.charismaBase));
				break;
			case "MOUNTAINDWARF": System.out.println("Seus atributos são: \n" +
			"Strenght: " + (MountainDwarf.strengthBase + AtributoBase.strengthBase) + "\n" +
			"Dexterity: " + (MountainDwarf.dexterityBase + AtributoBase.dexterityBase) + "\n" +
			"constitution: " + (MountainDwarf.constitutionBase + AtributoBase.constitutionBase) + "\n" +
			"intelligence: " + (MountainDwarf.intelligenceBase + AtributoBase.intelligenceBase) + "\n" +
			"wisdom: " + (MountainDwarf.wisdomBase + AtributoBase.wisdomBase) + "\n" +
			"charisma: " + (MountainDwarf.charismaBase + AtributoBase.charismaBase));
				break;
			case "TIEFLING": System.out.println("Seus atributos são: \n" +
			"Strenght: " + (Tiefling.strengthBase + AtributoBase.strengthBase) + "\n" +
			"Dexterity: " + (Tiefling.dexterityBase + AtributoBase.dexterityBase) + "\n" +
			"constitution: " + (Tiefling.constitutionBase + AtributoBase.constitutionBase) + "\n" +
			"intelligence: " + (Tiefling.intelligenceBase + AtributoBase.intelligenceBase) + "\n" +
			"wisdom: " + (Tiefling.wisdomBase + AtributoBase.wisdomBase) + "\n" +
			"charisma: " + (Tiefling.charismaBase + AtributoBase.charismaBase));
				break;
		 }
		 
		System.out.println("Hora de escolher sua classe, as opções são:");
		in.close();
	}
	
}	