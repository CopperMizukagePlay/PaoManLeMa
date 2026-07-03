package p170w1;

import p149t4.AbstractC3269f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w1.d */
/* loaded from: classes.dex */
public final class C3664d extends AbstractC3269f {

    /* renamed from: c */
    public static C3664d f17500c;

    @Override // p149t4.AbstractC3269f
    /* renamed from: a */
    public final int[] mo4982a(int i7) {
        int length = m4984c().length();
        if (length > 0 && i7 < length) {
            if (i7 < 0) {
                i7 = 0;
            }
            while (i7 < length && m4984c().charAt(i7) == '\n' && (m4984c().charAt(i7) == '\n' || (i7 != 0 && m4984c().charAt(i7 - 1) != '\n'))) {
                i7++;
            }
            if (i7 >= length) {
                return null;
            }
            int i8 = i7 + 1;
            while (i8 < length && !m5663f(i8)) {
                i8++;
            }
            return m4983b(i7, i8);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        return null;
     */
    @Override // p149t4.AbstractC3269f
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] mo4985e(int i7) {
        int length = m4984c().length();
        if (length > 0 && i7 > 0) {
            if (i7 > length) {
                i7 = length;
            }
            while (i7 > 0 && m4984c().charAt(i7 - 1) == '\n' && !m5663f(i7)) {
                i7--;
            }
            int i8 = i7 - 1;
            while (i8 > 0 && (m4984c().charAt(i8) == '\n' || (i8 != 0 && m4984c().charAt(i8 - 1) != '\n'))) {
                i8--;
            }
            return m4983b(i8, i7);
        }
        return null;
    }

    /* renamed from: f */
    public final boolean m5663f(int i7) {
        if (i7 > 0 && m4984c().charAt(i7 - 1) != '\n') {
            if (i7 == m4984c().length() || m4984c().charAt(i7) == '\n') {
                return true;
            }
            return false;
        }
        return false;
    }
}
