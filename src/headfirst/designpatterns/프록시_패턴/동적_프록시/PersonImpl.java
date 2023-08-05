package headfirst.designpatterns.프록시_패턴.동적_프록시;

public class PersonImpl implements Person{
    String name;
    String gender;
    String interests;
    int rating;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public int getGeekRating() {
        if (ratingCount == 0) return 0;
        return (rating / ratingCount);
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Override
    public void setGeekRating(int rating) {
        this.rating += rating;
        ratingCount++;
    }

    int ratingCount = 0;

}
