package State;

class AirplaneModeState implements PhoneState {
    @Override
    public void pressPowerButton(Phone phone) {
        System.out.println("Phone locked in Airplane Mode.");
        phone.setState(new LockedState());
    }

    @Override
    public void incomingCall(Phone phone) {
        System.out.println("No incoming calls — Airplane Mode is ON.");
    }

    @Override
    public void answerCall(Phone phone) {
        System.out.println("Cannot answer calls — Airplane Mode is ON.");
    }

    @Override
    public void hangUp(Phone phone) {
        System.out.println("Nothing to hang up.");
    }
}
