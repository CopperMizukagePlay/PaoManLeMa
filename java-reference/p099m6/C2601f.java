package p099m6;

import java.util.Comparator;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m6.f */
/* loaded from: classes.dex */
public final class C2601f implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        AbstractC3367j.m5100e(str, "a");
        AbstractC3367j.m5100e(str2, "b");
        int min = Math.min(str.length(), str2.length());
        for (int i7 = 4; i7 < min; i7++) {
            char charAt = str.charAt(i7);
            char charAt2 = str2.charAt(i7);
            if (charAt != charAt2) {
                if (AbstractC3367j.m5101f(charAt, charAt2) < 0) {
                    return -1;
                }
                return 1;
            }
        }
        int length = str.length();
        int length2 = str2.length();
        if (length != length2) {
            if (length < length2) {
                return -1;
            }
            return 1;
        }
        return 0;
    }
}
