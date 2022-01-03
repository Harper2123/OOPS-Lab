package practical2;

import java.util.*;

class Employee {
    int empid;
    long mobile;
    String name, address, mailid;
    Scanner get = new Scanner(System.in);

    void getData() {
        System.out.println("Enter the Name of the Employee: ");
        name = get.nextLine();
        System.out.println("Enter mail id: ");
        mailid = get.nextLine();
        System.out.println("Enter Address of the Employee: ");
        address = get.nextLine();
        System.out.println("Enter employee id: ");
        empid = get.nextInt();
        System.out.println("Enter Mobile Number: ");
        mobile = get.nextLong();
    }

    void display() {
    	System.out.println("\n");
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Id: " + empid);
        System.out.println("Email id: " + mailid);
        System.out.println("Address: " + address);
        System.out.println("Mobile Number: " + mobile);
    }
}

class Programmer extends Employee {
    double salary, bp, da, hra, pf, club, net, gross;

    void getProgrammer() {
        System.out.println("Enter Basic Pay: ");
        bp = get.nextDouble();
    }

    void calculateProg() {
        da = 0.97 * bp;
        hra = 0.10 * bp;
        pf = 0.12 * bp;
        club = 0.1 * bp;
        gross = bp + da + hra;
        net = gross - pf - club;
        System.out.println("****************************************");
        System.out.println("PAY SLIP FOR PROGRAMMER");
        System.out.println("****************************************");
        System.out.println("Basic Pay: Rs " + bp);
        System.out.println("DA: Rs " + da);
        System.out.println("HRA: Rs " + hra);
        System.out.println("PF: Rs " + pf);
        System.out.println("CLUB: Rs " + club);
        System.out.println("GROSS PAY: Rs " + gross);
        System.out.println("NET PAY: Rs " + net);
    }
}

class TeamLead extends Employee {
    double salary, bp, da, hra, pf, club, net, gross;

    void getTeamLead() {
        System.out.println("Enter Basic Pay: ");
        bp = get.nextDouble();
    }

    void calculateTL() {
        da = 0.97 * bp;
        hra = 0.10 * bp;
        pf = 0.12 * bp;
        club = 0.1 * bp;
        gross = bp + da + hra;
        net = gross - pf - club;
        System.out.println("****************************************");
        System.out.println("PAY SLIP FOR TEAM LEAD");
        System.out.println("****************************************");
        System.out.println("Basic Pay: Rs " + bp);
        System.out.println("DA: Rs " + da);
        System.out.println("HRA: Rs " + hra);
        System.out.println("PF: Rs " + pf);
        System.out.println("CLUB: Rs " + club);
        System.out.println("GROSS PAY: Rs " + gross);
        System.out.println("NET PAY: Rs " + net);
    }
}

class AsstProjManager extends Employee {
    double salary, bp, da, hra, pf, club, net, gross;

    void getAsstProjManager() {
        System.out.println("Enter Basic Pay: ");
        bp = get.nextDouble();
    }

    void calculateAsstProjMgr() {
        da = 0.97 * bp;
        hra = 0.10 * bp;
        pf = 0.12 * bp;
        club = 0.1 * bp;
        gross = bp + da + hra;
        net = gross - pf - club;
        System.out.println("****************************************");
        System.out.println("PAY SLIP FOR ASSISTANT PROJECT MANAGER");
        System.out.println("****************************************");
        System.out.println("Basic Pay: Rs " + bp);
        System.out.println("DA: Rs " + da);
        System.out.println("HRA: Rs " + hra);
        System.out.println("PF: Rs " + pf);
        System.out.println("CLUB: Rs " + club);
        System.out.println("GROSS PAY: Rs " + gross);
        System.out.println("NET PAY: Rs " + net);
    }
}

class ProjManager extends Employee {
    double salary, bp, da, hra, pf, club, net, gross;

    void getProjManager() {
        System.out.println("Enter Basic Pay: ");
        bp = get.nextDouble();
    }

    void calculateProjMgr() {
        da = 0.97 * bp;
        hra = 0.10 * bp;
        pf = 0.12 * bp;
        club = 0.1 * bp;
        gross = bp + da + hra;
        net = gross - pf - club;
        System.out.println("****************************************");
        System.out.println("PAY SLIP FOR PROJECT MANAGER");
        System.out.println("****************************************");
        System.out.println("Basic Pay: Rs " + bp);
        System.out.println("DA: Rs " + da);
        System.out.println("HRA: Rs " + hra);
        System.out.println("PF: Rs " + pf);
        System.out.println("CLUB: Rs " + club);
        System.out.println("GROSS PAY: Rs " + gross);
        System.out.println("NET PAY: Rs " + net);
    }
}
public class PaySlip {
	public static void main(String[] args) {
		int choice, cont;
		do {
            System.out.println("PAYROLL");
            System.out.println("1.PROGRAMMER \t 2.TEAM LEAD \t 3.ASSISTANT PROJECT MANAGER \t 4.PROJECT MANAGER ");
            Scanner c = new Scanner(System.in);
            System.out.println("Enter your choice: ");
            choice = c.nextInt();
            switch (choice) {
                case 1: {
                    Programmer p = new Programmer();
                    p.getData();
                    p.getProgrammer();
                    p.display();
                    p.calculateProg();
                    break;
                }
                case 2: {
                    TeamLead tlead = new TeamLead();
                    tlead.getData();
                    tlead.getTeamLead();
                    tlead.display();
                    tlead.calculateTL();
                    break;
                }
                case 3: {
                    AsstProjManager apm = new AsstProjManager();
                    apm.getData();
                    apm.getAsstProjManager();
                    apm.display();
                    apm.calculateAsstProjMgr();
                    break;
                }
                case 4: {
                    ProjManager pm = new ProjManager();
                    pm.getData();
                    pm.getProjManager();
                    pm.display();
                    pm.calculateProjMgr();
                    break;
                }
            }
            System.out.print("Please enter 0 to exit and 1 to continue: ");
            cont = c.nextInt();
        } while (cont == 1);
	}
}
