package single.wxy.typeXX2_chain;

/**
 * @author wxy
 * @date: 2023/5/21 9:27 PM
 * @ClassName: CollegeApprover
 */
public class CollegeApprover extends Approver{
    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPrice() < 5000 && purchaseRequest.getPrice() <= 10000) {
            System.out.println(" 请求编号id= " + purchaseRequest.getId() + " 被" + this.name + " 处理");
        }else {
            approver.processRequest(purchaseRequest);
        }
    }
}
