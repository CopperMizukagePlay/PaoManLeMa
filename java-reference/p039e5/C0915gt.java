package p039e5;

import java.util.ArrayList;
import java.util.List;
import p001a0.AbstractC0094y0;
import p060h5.C1813u;
import p092m.AbstractC2487d;
import p100n.AbstractC2647h;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.gt */
/* loaded from: classes.dex */
public final class C0915gt {

    /* renamed from: a */
    public final boolean f4377a;

    /* renamed from: b */
    public final String f4378b;

    /* renamed from: c */
    public final List f4379c;

    /* renamed from: d */
    public final EnumC0908gm f4380d;

    /* renamed from: e */
    public final int f4381e;

    /* renamed from: f */
    public final int f4382f;

    /* renamed from: g */
    public final String f4383g;

    /* renamed from: h */
    public final boolean f4384h;

    /* renamed from: i */
    public final String f4385i;

    public C0915gt(boolean z7, String str, List list, EnumC0908gm enumC0908gm, int i7, int i8, String str2, boolean z8, String str3) {
        AbstractC3367j.m5100e(str, "externalTarget");
        AbstractC3367j.m5100e(list, "interfaces");
        AbstractC3367j.m5100e(enumC0908gm, "congestionZone");
        AbstractC3367j.m5100e(str2, "protocolLabel");
        AbstractC3367j.m5100e(str3, "status");
        this.f4377a = z7;
        this.f4378b = str;
        this.f4379c = list;
        this.f4380d = enumC0908gm;
        this.f4381e = i7;
        this.f4382f = i8;
        this.f4383g = str2;
        this.f4384h = z8;
        this.f4385i = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.List] */
    /* renamed from: a */
    public static C0915gt m1552a(C0915gt c0915gt, boolean z7, ArrayList arrayList, boolean z8, String str, int i7) {
        String str2 = c0915gt.f4378b;
        ArrayList arrayList2 = arrayList;
        if ((i7 & 4) != 0) {
            arrayList2 = c0915gt.f4379c;
        }
        ArrayList arrayList3 = arrayList2;
        EnumC0908gm enumC0908gm = c0915gt.f4380d;
        int i8 = c0915gt.f4381e;
        int i9 = c0915gt.f4382f;
        String str3 = c0915gt.f4383g;
        if ((i7 & 128) != 0) {
            z8 = c0915gt.f4384h;
        }
        c0915gt.getClass();
        AbstractC3367j.m5100e(str2, "externalTarget");
        AbstractC3367j.m5100e(arrayList3, "interfaces");
        AbstractC3367j.m5100e(enumC0908gm, "congestionZone");
        AbstractC3367j.m5100e(str3, "protocolLabel");
        AbstractC3367j.m5100e(str, "status");
        return new C0915gt(z7, str2, arrayList3, enumC0908gm, i8, i9, str3, z8, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0915gt)) {
            return false;
        }
        C0915gt c0915gt = (C0915gt) obj;
        if (this.f4377a == c0915gt.f4377a && AbstractC3367j.m5096a(this.f4378b, c0915gt.f4378b) && AbstractC3367j.m5096a(this.f4379c, c0915gt.f4379c) && this.f4380d == c0915gt.f4380d && this.f4381e == c0915gt.f4381e && this.f4382f == c0915gt.f4382f && AbstractC3367j.m5096a(this.f4383g, c0915gt.f4383g) && this.f4384h == c0915gt.f4384h && AbstractC3367j.m5096a(this.f4385i, c0915gt.f4385i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4385i.hashCode() + AbstractC2487d.m4040d(AbstractC0094y0.m175b(AbstractC2647h.m4255a(this.f4382f, AbstractC2647h.m4255a(this.f4381e, (this.f4380d.hashCode() + AbstractC0094y0.m176c(this.f4379c, AbstractC0094y0.m175b(Boolean.hashCode(this.f4377a) * 31, 31, this.f4378b), 31)) * 31, 31), 31), 31, this.f4383g), 31, this.f4384h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpeedTestPingSnapshot(running=");
        sb.append(this.f4377a);
        sb.append(", externalTarget=");
        sb.append(this.f4378b);
        sb.append(", interfaces=");
        sb.append(this.f4379c);
        sb.append(", congestionZone=");
        sb.append(this.f4380d);
        sb.append(", sequence=");
        AbstractC0094y0.m192s(sb, this.f4381e, ", packetSizeBytes=", this.f4382f, ", protocolLabel=");
        sb.append(this.f4383g);
        sb.append(", gatewayMissing=");
        sb.append(this.f4384h);
        sb.append(", status=");
        return AbstractC2487d.m4046j(sb, this.f4385i, ")");
    }

    public /* synthetic */ C0915gt(boolean z7, String str, List list, EnumC0908gm enumC0908gm, int i7, int i8, String str2, boolean z8, String str3, int i9) {
        this((i9 & 1) != 0 ? false : z7, (i9 & 2) != 0 ? "" : str, (i9 & 4) != 0 ? C1813u.f10860e : list, (i9 & 8) != 0 ? EnumC0908gm.f4308f : enumC0908gm, (i9 & 16) != 0 ? 0 : i7, (i9 & 32) != 0 ? 1400 : i8, (i9 & 64) != 0 ? "" : str2, (i9 & 128) != 0 ? false : z8, (i9 & 256) != 0 ? "未启动" : str3);
    }
}
