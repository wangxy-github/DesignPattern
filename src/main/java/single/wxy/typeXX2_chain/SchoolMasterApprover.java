package single.wxy.typeXX2_chain;

/**
 * @author wxy
 * @date: 2023/5/21 9:30 PM
 * @ClassName: SchoolMasterApprover
 */
public class SchoolMasterApprover extends Approver {
    public SchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() > 30000) {
            System.out.println(" 请求编号id= " + purchaseRequest.getId() + " 被" + this.name + " 处理");
        } else {
            approver.processRequest(purchaseRequest);
        }
    }
}
