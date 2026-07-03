package p047f6;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: f6.j */
/* loaded from: classes.dex */
public abstract class AbstractC1555j {

    /* renamed from: a */
    public static final C1554i f10169a = new Object();

    /* renamed from: a */
    public static C1548c m2510a(int i7, int i8, EnumC1546a enumC1546a) {
        if ((i8 & 1) != 0) {
            i7 = 0;
        }
        int i9 = i8 & 2;
        EnumC1546a enumC1546a2 = EnumC1546a.f10128e;
        if (i9 != 0) {
            enumC1546a = enumC1546a2;
        }
        if (i7 != -2) {
            if (i7 != -1) {
                if (i7 != 0) {
                    if (i7 != Integer.MAX_VALUE) {
                        if (enumC1546a == enumC1546a2) {
                            return new C1548c(i7);
                        }
                        return new C1559n(i7, enumC1546a);
                    }
                    return new C1548c(Integer.MAX_VALUE);
                }
                if (enumC1546a == enumC1546a2) {
                    return new C1548c(0);
                }
                return new C1559n(1, enumC1546a);
            }
            if (enumC1546a == enumC1546a2) {
                return new C1559n(1, EnumC1546a.f10129f);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (enumC1546a == enumC1546a2) {
            InterfaceC1552g.f10167a.getClass();
            return new C1548c(C1551f.f10166b);
        }
        return new C1559n(1, enumC1546a);
    }
}
