package p037e3;

import android.util.Base64;
import java.util.List;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e3.d */
/* loaded from: classes.dex */
public final class C0690d {

    /* renamed from: a */
    public final String f2238a;

    /* renamed from: b */
    public final String f2239b;

    /* renamed from: c */
    public final String f2240c;

    /* renamed from: d */
    public final List f2241d;

    /* renamed from: e */
    public final String f2242e;

    /* renamed from: f */
    public final String f2243f;

    public C0690d(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        this.f2238a = str;
        str2.getClass();
        this.f2239b = str2;
        this.f2240c = str3;
        list.getClass();
        this.f2241d = list;
        this.f2242e = str4;
        this.f2243f = str5;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        sb.append("-");
        sb.append(str3);
        sb.append("-");
        sb.append(str4);
        sb.append("-");
        sb.append(str5);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f2238a + ", mProviderPackage: " + this.f2239b + ", mQuery: " + this.f2240c + ", mSystemFont: " + this.f2242e + ", mVariationSettings: " + this.f2243f + ", mCertificates:");
        int i7 = 0;
        while (true) {
            List list = this.f2241d;
            if (i7 < list.size()) {
                sb.append(" [");
                List list2 = (List) list.get(i7);
                for (int i8 = 0; i8 < list2.size(); i8++) {
                    sb.append(" \"");
                    sb.append(Base64.encodeToString((byte[]) list2.get(i8), 0));
                    sb.append("\"");
                }
                sb.append(" ]");
                i7++;
            } else {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
        }
    }
}
