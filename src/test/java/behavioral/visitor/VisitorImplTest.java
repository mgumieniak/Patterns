//public class SimplifyExprVisitor {
//...
//    public Expr visit(BinOp e){
//        if("+".equals(e.opname) && e.right instanceof Number && ...){
//            return e.left;
//        }
//        return e;
//
//    }
//}
//
//
//class BinOp extends Expr{
//...
//    public Expr accept(SimplifyExprVisitor v){
//        return v.visit(this);
//    }
//}


