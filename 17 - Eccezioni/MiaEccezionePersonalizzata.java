
public class MiaEccezionePersonalizzata extends Exception{

	public MiaEccezionePersonalizzata() {
		super();
		System.out.println("Scatenata Eccezione personalizzata.");
	}

	@Override
	public String toString() {
		return "MiaEccezionePersonalizzata []";
	}
}