package p039e5;

import java.util.Set;
import p144t.AbstractC3122c;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.qe */
/* loaded from: classes.dex */
public final /* synthetic */ class C1210qe implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ int f7091e;

    /* renamed from: f */
    public final /* synthetic */ Set f7092f;

    public /* synthetic */ C1210qe(Set set, int i7) {
        this.f7091e = i7;
        this.f7092f = set;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        boolean contains;
        switch (this.f7091e) {
            case 0:
                String str = (String) obj;
                AbstractC3367j.m5100e(str, "it");
                contains = this.f7092f.contains(str);
                break;
            case 1:
                String str2 = (String) obj;
                AbstractC3367j.m5100e(str2, "it");
                contains = this.f7092f.contains(str2);
                break;
            case 2:
                String str3 = (String) obj;
                AbstractC3367j.m5100e(str3, "it");
                contains = this.f7092f.contains(str3);
                break;
            case 3:
                String str4 = (String) obj;
                AbstractC3367j.m5100e(str4, "it");
                contains = this.f7092f.contains(str4);
                break;
            case 4:
                contains = this.f7092f.contains((String) obj);
                break;
            case AbstractC3122c.f15761f /* 5 */:
                contains = this.f7092f.contains((String) obj);
                break;
            case AbstractC3122c.f15759d /* 6 */:
                contains = this.f7092f.contains((String) obj);
                break;
            default:
                contains = this.f7092f.contains((String) obj);
                break;
        }
        return Boolean.valueOf(!contains);
    }
}
