package Factory;

public class GetPlanFactory{

    //use getPlan method to get object of type Plan
    public Factory.Plan getPlan(String planType){
        if(planType == null){
            return null;
        }
        if(planType.equalsIgnoreCase("DOMESTICPLAN")) {
            return new Factory.DomesticPlan();
        }
        else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){
            return new Factory.CommercialPlan();
        }
        else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
            return new Factory.InstitutionalPlan();
        }
        return null;
    }
}//end of GetPlanFactory class.
