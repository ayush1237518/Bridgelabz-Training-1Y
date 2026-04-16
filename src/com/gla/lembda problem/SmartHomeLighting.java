import java.util.function.Consumer;

public class SmartHomeLighting {
    public static void main(String[] args) {

        Consumer<String> motionLight = (room) ->
                System.out.println("Motion detected: Lights ON in " + room);

        Consumer<String> nightLight = (room) ->
                System.out.println("Night mode: Dim lights in " + room);

        Consumer<String> voiceCommand = (room) ->
                System.out.println("Voice command: Toggle lights in " + room);

        motionLight.accept("Living Room");
        nightLight.accept("Bedroom");
        voiceCommand.accept("Kitchen");
    }
}
