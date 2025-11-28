package State;

interface PhoneState {
    void pressPowerButton(Phone phone);
    void incomingCall(Phone phone);
    void answerCall(Phone phone);
    void hangUp(Phone phone);
}
