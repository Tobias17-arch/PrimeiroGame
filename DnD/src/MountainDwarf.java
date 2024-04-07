
public class MountainDwarf {
	int strengthBase = 2;
	int dexterityBase = 0;
	int constitutionBase = 0;
	int intelligenceBase = 0;
	int wisdomBase = 0;
	int charismaBase = 1;
	public static void MountainDwarf(String[] args){
		MountainDwarf atributosMountainDwarf = new MountainDwarf();
		AtributoBase atributoBase = new AtributoBase();
		
		int StrengthMountainDwarf = atributosMountainDwarf.strengthBase + atributoBase.strengthBase;
		int DexterityMountainDwarf = atributosMountainDwarf.dexterityBase + atributoBase.dexterityBase;
		int ConstitutionMountainDwarf = atributosMountainDwarf.constitutionBase + atributoBase.constitutionBase;
		int intelligenceMountainDwarf = atributosMountainDwarf.intelligenceBase + atributoBase.intelligenceBase;
		int wisdomMountainDwarf = atributosMountainDwarf.wisdomBase + atributoBase.wisdomBase;
		int charismaMountainDwarf = atributosMountainDwarf.charismaBase + atributoBase.charismaBase;
		
	}
}
