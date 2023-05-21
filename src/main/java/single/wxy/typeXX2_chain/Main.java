package single.wxy.typeXX2_chain;

/**
 * @author wxy
 * @date: 2023/5/21 9:27 PM
 * @ClassName: Main
 */
public class Main {
    public static void main(String[] args) {
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, 31000, 1);

        //创建相关的审批人
        DepartmentApprover departmentApprover = new DepartmentApprover("张主任");
        CollegeApprover collegeApprover = new CollegeApprover("李院长");
        ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("王副校");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("刘校长");

        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setApprover(schoolMasterApprover);
        schoolMasterApprover.setApprover(departmentApprover);

        departmentApprover.processRequest(purchaseRequest);
//        viceSchoolMasterApprover.processRequest(purchaseRequest);
    }
}
