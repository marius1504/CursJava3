package Curs3;

public class MathTeacher implements ITeacher{

    @Override
    public String getHomework() {
        return "Solve 100 calculus problems";
    }

    @Override
    public String getWisdom() {
        return null;
    }
}
