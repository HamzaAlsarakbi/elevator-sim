package src.scheduler_state;

import src.SchedulerSystem;

public class SchedulerIdleState extends SchedulerState  {
    @Override
    public void handle() {

        while (true){

            if (SchedulerSystem.receievedData()){
                SchedulerSystem.setState(new SchedulerProcessingRequestState());
            }
        }

    }
}