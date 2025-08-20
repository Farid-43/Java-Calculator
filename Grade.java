public class Grade {
    public String getGrade(int score) {
        if (score >= 80)
            return "A+";
        else if (score >= 75)
            return "A";
        else if (score >= 70)
            return "A-";
        else if (score >= 65)
            return "B+";
        else if (score >= 60)
            return "B";
        else if (score >= 55)
            return "B-";
        else if (score >= 50)
            return "C";
        else if (score >= 40)
            return "D";
        else
            return "F";
    }
}
