package p155u2;

import java.util.List;
import p039e5.C1162os;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: u2.a */
/* loaded from: classes.dex */
public abstract class AbstractC3353a {
    /* renamed from: a */
    public static String m5086a(List list, String str, C1162os c1162os, int i7) {
        if ((i7 & 1) != 0) {
            str = ", ";
        }
        if ((i7 & 32) != 0) {
            c1162os = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = list.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            Object obj = list.get(i9);
            boolean z7 = true;
            i8++;
            if (i8 > 1) {
                sb.append((CharSequence) str);
            }
            if (c1162os != null) {
                sb.append((CharSequence) c1162os.mo23f(obj));
            } else {
                if (obj != null) {
                    z7 = obj instanceof CharSequence;
                }
                if (z7) {
                    sb.append((CharSequence) obj);
                } else if (obj instanceof Character) {
                    sb.append(((Character) obj).charValue());
                } else {
                    sb.append((CharSequence) obj.toString());
                }
            }
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    /* renamed from: b */
    public static final void m5087b(String str) {
        throw new UnsupportedOperationException(str);
    }
}
