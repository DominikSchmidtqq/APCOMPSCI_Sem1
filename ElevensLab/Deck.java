import java.util.List;
import java.util.ArrayList;
public class Deck {
	private List<Card> cards;
	private int size;
	public Deck(String[] ranks, String[] suits, int[] values) {
		cards = new ArrayList<Card>();
		for (int j = 0; j < ranks.length; j++) {
			for (String suitString : suits) {
				cards.add(new Card(ranks[j], suitString, values[j]));
			}
		}
		size = cards.size();
		shuffle();
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public int size() {
		return size;
	}
	public void shuffle() {
		for( int k = size - 1; k >= 0; k-- ) {
            int r = (int)(Math.random() * k);
            Card tmp = cards.get(r);
            cards.set(r, cards.get(k));
            cards.set(k, tmp);
        }
	}
	public Card deal() {
		size--;
		Card c = cards.get(size);
		return c;
	}
	@Override
	public String toString() {
		String rtrn = "size = " + size + "\nUndealt cards: \n";
		for (int k = size - 1; k >= 0; k--) {
			rtrn = rtrn + cards.get(k);
			if (k != 0) {
				rtrn = rtrn + ", ";
			}
			if ((size - k) % 2 == 0) {
				rtrn = rtrn + "\n";
			}
		}
		rtrn = rtrn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtrn = rtrn + cards.get(k);
			if (k != size) {
				rtrn = rtrn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
				rtrn = rtrn + "\n";
			}
		}
		rtrn = rtrn + "\n";
		return rtrn;
	}
}
