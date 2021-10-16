package smev.FRI.Strategy;

import smev.FRI.Service.BroadcastStrategy;

//стратегия по умолчанию
public class DefaultStrategy implements BroadcastStrategy {
    @Override
    public void reading() {

    }

    @Override
    public String getIdInquery() {
        return "";
    }
}
