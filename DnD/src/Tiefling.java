
public class Tiefling {
	int strengthBase = 0;
	int dexterityBase = 0;
	int constitutionBase = 0;
	int intelligenceBase = 1;
	int wisdomBase = 0;
	int charismaBase = 2;
	public static void Tiefling(String[] args){
		Tiefling atributosTiefling = new Tiefling();
		AtributoBase atributoBase = new AtributoBase();
		
		int StrengthTiefling = atributosTiefling.strengthBase + atributoBase.strengthBase;
		int DexterityTiefling = atributosTiefling.dexterityBase + atributoBase.dexterityBase;
		int ConstitutionTiefling = atributosTiefling.constitutionBase + atributoBase.constitutionBase;
		int intelligenceTiefling = atributosTiefling.intelligenceBase + atributoBase.intelligenceBase;
		int wisdomTiefling = atributosTiefling.wisdomBase + atributoBase.wisdomBase;
		int charismaTiefling = atributosTiefling.charismaBase + atributoBase.charismaBase;
		
	}
}
