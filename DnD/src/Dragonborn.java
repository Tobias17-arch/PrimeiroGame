import java.util.ArrayList;
import java.util.List;

public class Dragonborn {
	int strengthBase = 2;
	int dexterityBase = 0;
	int constitutionBase = 0;
	int intelligenceBase = 0;
	int wisdomBase = 0;
	int charismaBase = 1;
	public static void Dragonborn(String[] args){
		Dragonborn atributosDragonborn = new Dragonborn();
		AtributoBase atributoBase = new AtributoBase(); 
		
		int StrengthDragonborn = atributosDragonborn.strengthBase + atributoBase.strengthBase;
		int DexterityDragonborn = atributosDragonborn.dexterityBase + atributoBase.dexterityBase;
		int ConstitutionDragonborn = atributosDragonborn.constitutionBase + atributoBase.constitutionBase;
		int IntelligenceDragonborn = atributosDragonborn.intelligenceBase + atributoBase.intelligenceBase;
		int WisdomDragonborn = atributosDragonborn.wisdomBase + atributoBase.wisdomBase;
		int CharismaDragonborn = atributosDragonborn.charismaBase + atributoBase.charismaBase;
		
		
		int[] atributosDragonborn2 = {StrengthDragonborn, DexterityDragonborn, ConstitutionDragonborn, IntelligenceDragonborn, WisdomDragonborn, CharismaDragonborn};
		
		//ArrayList <Integer> atributosDragonborn2 = new ArrayList <>();
		//atributosDragonborn2.add(StrengthDragonborn);
		//atributosDragonborn2.add(DexterityDragonborn);
		//atributosDragonborn2.add(ConstitutionDragonborn);
		//atributosDragonborn2.add(IntelligenceDragonborn);
		//atributosDragonborn2.add(WisdomDragonborn);
		//atributosDragonborn2.add(CharismaDragonborn);
		
		
	}


}
