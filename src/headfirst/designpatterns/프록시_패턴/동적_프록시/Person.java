package headfirst.designpatterns.프록시_패턴.동적_프록시;

public interface Person {

    String getName();
    String getGender();
    String getInterests();
    int getGeekRating();

    void setName(String name);
    void setGender(String gender);
    void setInterests(String interests);
    void setGeekRating(int rating);
}
