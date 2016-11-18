package webinar_suleimanov;

/**
 * Created by annabredun on 17.10.16.
 */
public class Developer {
    // TODO: Маркерный интерфейс - тот, в котором ничего нет, пустой
    private String name;
    private String speciality;
    private Integer experience;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }
}
