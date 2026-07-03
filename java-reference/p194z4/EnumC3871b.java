package p194z4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 z4.b, still in use, count: 1, list:
  (r1v1 z4.b) from 0x002a: FILLED_NEW_ARRAY (r3v1 z4.b), (r0v0 z4.b), (r5v1 z4.b), (r1v1 z4.b) A[WRAPPED] (LINE:43) elemType: z4.b
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:238)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: z4.b */
/* loaded from: classes.dex */
public final class EnumC3871b {
    f18134f("L"),
    f18135g("M"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("Q"),
    /* JADX INFO: Fake field, exist only in values array */
    EF5("H");


    /* renamed from: h */
    public static final EnumC3871b[] f18136h;

    /* renamed from: e */
    public final int f18138e;

    static {
        EnumC3871b enumC3871b = f18134f;
        EnumC3871b enumC3871b2 = f18135g;
        f18136h = new EnumC3871b[]{enumC3871b2, enumC3871b, r5, r1};
    }

    public EnumC3871b(String str) {
        this.f18138e = r2;
    }

    public static EnumC3871b valueOf(String str) {
        return (EnumC3871b) Enum.valueOf(EnumC3871b.class, str);
    }

    public static EnumC3871b[] values() {
        return (EnumC3871b[]) f18137i.clone();
    }
}
