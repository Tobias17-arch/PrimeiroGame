public enum RaceType {
    DRAGONBORN(1L, "Draconato"),
    HIGHELF(2L, "High Elf"),
    LOWELF(3L, "Low Elf"),
    HUMAN(4L, "Humano"),
    DWARF(5L, "Anão"),
    MOUNTAINDWARF(6L, "Anão da Montanha"),
    TIEFLING(7L, "Tiefling");

    private Long id;
    private String name;

    RaceType(Long id, String name){
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public static RaceType getById(Long id) {
        for(RaceType race : values()) {
            if(race.id.equals(id)) return race;
        }
        return null;
    
    }
}