package p099m6;

import java.nio.charset.Charset;
import java.util.regex.Pattern;
import p024c6.AbstractC0451r;
import p068i5.AbstractC2080d;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m6.v */
/* loaded from: classes.dex */
public final class C2621v {

    /* renamed from: c */
    public static final Pattern f14160c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: d */
    public static final Pattern f14161d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a */
    public final String f14162a;

    /* renamed from: b */
    public final String[] f14163b;

    public C2621v(String str, String[] strArr) {
        this.f14162a = str;
        this.f14163b = strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Charset m4179a(Charset charset) {
        String str;
        String[] strArr = this.f14163b;
        int i7 = 0;
        int m3402o = AbstractC2080d.m3402o(0, strArr.length - 1, 2);
        if (m3402o >= 0) {
            while (!AbstractC0451r.m966H(strArr[i7], "charset")) {
                if (i7 != m3402o) {
                    i7 += 2;
                }
            }
            str = strArr[i7 + 1];
            if (str != null) {
                return charset;
            }
            try {
                return Charset.forName(str);
            } catch (IllegalArgumentException unused) {
                return charset;
            }
        }
        str = null;
        if (str != null) {
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C2621v) && AbstractC3367j.m5096a(((C2621v) obj).f14162a, this.f14162a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14162a.hashCode();
    }

    public final String toString() {
        return this.f14162a;
    }
}
