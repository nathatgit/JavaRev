package OopsConceptsP1;

public class CallByValueNCallByRef {

	int p, q;

	public static void main(String[] args) {

		CallByValueNCallByRef cx = new CallByValueNCallByRef();
		int x, y;
		x = 99;
		y = 9;

		cx.testSubtraction(x, y); // Call By Value OR Pass the value

		cx.p = 900;
		cx.q = 909;
		System.out.println("***Before Swaping***");
		System.out.println("value of p = " + cx.p);
		System.out.println("value of q = " + cx.q);

		cx.Swap(cx); // Call by Reference

	}

	public int testSubtraction(int a, int b) {
		a = 999;
		b = 77;
		int c = a - b;
		System.out.println(c);
		return c;

	}

	public void Swap(CallByValueNCallByRef h) {
		int temp = h.p;
		h.p = h.q;
		h.q = temp;

		System.out.println("***after Swaping***");
		System.out.println("value of p = " + h.p);
		System.out.println("value of q = " + h.q);

	}

}
