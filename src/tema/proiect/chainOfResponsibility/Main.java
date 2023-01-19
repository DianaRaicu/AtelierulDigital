package tema.proiect.chainOfResponsibility;
/*
Problema: Descrierea ierarhiei unei companii si asignarea rolurilor corespunzatoare
Solutie folosind Chain of Responsibility Design Pattern
 */

public class Main {
    private static Company getChainOfCommand(){
        Company topManagers = new TopManagers(Company.TM);
        Company middleManagers = new MiddleManagers(Company.MM);
        Company frontLineManagers = new FrontLineManagers(Company.FLM);
        Company employees = new Employees(Company.Emp);

        topManagers.setNextInCommand(middleManagers);
        middleManagers.setNextInCommand(frontLineManagers);
        frontLineManagers.setNextInCommand(employees);

        return topManagers;
    }

    public static void main(String[] args) {
        Company command =  getChainOfCommand();

        command.Message(Company.TM,"Report to CEO");
        command.Message(Company.MM,"Report to top management");
        command.Message(Company.FLM,"Report to middle managers");
        command.Message(Company.Emp,"Report to front-line managers");

    }
}
