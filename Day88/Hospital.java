public class Hospital {
 private String hospitalName;
 private String place;
 private int constructedYears;
 private String founderName;
 private int rating;
    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getConstructedYears() {
        return constructedYears;
    }

    public void setConstructedYears(int constructedYears) {
        this.constructedYears = constructedYears;
    }

    public String getFounderName() {
        return founderName;
    }

    public void setFounderName(String founderName) {
        this.founderName = founderName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalName='" + hospitalName + '\'' +
                ", place='" + place + '\'' +
                ", constructedYears=" + constructedYears +
                ", founderName='" + founderName + '\'' +
                ", rating=" + rating +
                '}';
    }
}
