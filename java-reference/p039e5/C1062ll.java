package p039e5;

import java.util.ArrayList;
import java.util.List;
import p001a0.AbstractC0094y0;
import p060h5.C1813u;
import p092m.AbstractC2487d;
import p158u5.AbstractC3367j;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ll */
/* loaded from: classes.dex */
public final class C1062ll {

    /* renamed from: a */
    public final boolean f5684a;

    /* renamed from: b */
    public final EnumC1495zk f5685b;

    /* renamed from: c */
    public final EnumC1402wk f5686c;

    /* renamed from: d */
    public final EnumC0748bl f5687d;

    /* renamed from: e */
    public final List f5688e;

    /* renamed from: f */
    public final String f5689f;

    /* renamed from: g */
    public final String f5690g;

    /* renamed from: h */
    public final String f5691h;

    /* renamed from: i */
    public final String f5692i;

    /* renamed from: j */
    public final String f5693j;

    /* renamed from: k */
    public final String f5694k;

    /* renamed from: l */
    public final String f5695l;

    /* renamed from: m */
    public final String f5696m;

    /* renamed from: n */
    public final String f5697n;

    /* renamed from: o */
    public final List f5698o;

    /* renamed from: p */
    public final List f5699p;

    public C1062ll(boolean z7, EnumC1495zk enumC1495zk, EnumC1402wk enumC1402wk, EnumC0748bl enumC0748bl, List list, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list2, List list3) {
        AbstractC3367j.m5100e(enumC1495zk, "rfcMode");
        AbstractC3367j.m5100e(enumC1402wk, "addressFamily");
        AbstractC3367j.m5100e(enumC0748bl, "transport");
        AbstractC3367j.m5100e(list, "transports");
        AbstractC3367j.m5100e(str9, "status");
        this.f5684a = z7;
        this.f5685b = enumC1495zk;
        this.f5686c = enumC1402wk;
        this.f5687d = enumC0748bl;
        this.f5688e = list;
        this.f5689f = str;
        this.f5690g = str2;
        this.f5691h = str3;
        this.f5692i = str4;
        this.f5693j = str5;
        this.f5694k = str6;
        this.f5695l = str7;
        this.f5696m = str8;
        this.f5697n = str9;
        this.f5698o = list2;
        this.f5699p = list3;
    }

    /* renamed from: a */
    public static C1062ll m1635a(C1062ll c1062ll, EnumC1402wk enumC1402wk, EnumC0748bl enumC0748bl, List list, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list2, ArrayList arrayList, int i7) {
        boolean z7;
        EnumC1402wk enumC1402wk2;
        EnumC0748bl enumC0748bl2;
        List list3;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        List list4;
        List list5;
        if ((i7 & 1) != 0) {
            z7 = c1062ll.f5684a;
        } else {
            z7 = false;
        }
        boolean z8 = z7;
        EnumC1495zk enumC1495zk = c1062ll.f5685b;
        if ((i7 & 4) != 0) {
            enumC1402wk2 = c1062ll.f5686c;
        } else {
            enumC1402wk2 = enumC1402wk;
        }
        if ((i7 & 8) != 0) {
            enumC0748bl2 = c1062ll.f5687d;
        } else {
            enumC0748bl2 = enumC0748bl;
        }
        if ((i7 & 16) != 0) {
            list3 = c1062ll.f5688e;
        } else {
            list3 = list;
        }
        if ((i7 & 32) != 0) {
            str10 = c1062ll.f5689f;
        } else {
            str10 = str;
        }
        if ((i7 & 64) != 0) {
            str11 = c1062ll.f5690g;
        } else {
            str11 = str2;
        }
        if ((i7 & 128) != 0) {
            str12 = c1062ll.f5691h;
        } else {
            str12 = str3;
        }
        if ((i7 & 256) != 0) {
            str13 = c1062ll.f5692i;
        } else {
            str13 = str4;
        }
        if ((i7 & 512) != 0) {
            str14 = c1062ll.f5693j;
        } else {
            str14 = str5;
        }
        if ((i7 & 1024) != 0) {
            str15 = c1062ll.f5694k;
        } else {
            str15 = str6;
        }
        if ((i7 & 2048) != 0) {
            str16 = c1062ll.f5695l;
        } else {
            str16 = str7;
        }
        if ((i7 & 4096) != 0) {
            str17 = c1062ll.f5696m;
        } else {
            str17 = str8;
        }
        if ((i7 & 8192) != 0) {
            str18 = c1062ll.f5697n;
        } else {
            str18 = str9;
        }
        if ((i7 & 16384) != 0) {
            list4 = c1062ll.f5698o;
        } else {
            list4 = list2;
        }
        if ((i7 & 32768) != 0) {
            list5 = c1062ll.f5699p;
        } else {
            list5 = arrayList;
        }
        c1062ll.getClass();
        AbstractC3367j.m5100e(enumC1495zk, "rfcMode");
        AbstractC3367j.m5100e(enumC1402wk2, "addressFamily");
        AbstractC3367j.m5100e(enumC0748bl2, "transport");
        AbstractC3367j.m5100e(list3, "transports");
        AbstractC3367j.m5100e(str10, "server");
        AbstractC3367j.m5100e(str11, "localEndpoint");
        AbstractC3367j.m5100e(str12, "publicEndpoint");
        AbstractC3367j.m5100e(str13, "otherEndpoint");
        AbstractC3367j.m5100e(str14, "natType");
        AbstractC3367j.m5100e(str15, "bindingResult");
        AbstractC3367j.m5100e(str16, "mappingBehavior");
        AbstractC3367j.m5100e(str17, "filteringBehavior");
        AbstractC3367j.m5100e(str18, "status");
        AbstractC3367j.m5100e(list4, "results");
        AbstractC3367j.m5100e(list5, "events");
        return new C1062ll(z8, enumC1495zk, enumC1402wk2, enumC0748bl2, list3, str10, str11, str12, str13, str14, str15, str16, str17, str18, list4, list5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1062ll)) {
            return false;
        }
        C1062ll c1062ll = (C1062ll) obj;
        if (this.f5684a == c1062ll.f5684a && this.f5685b == c1062ll.f5685b && this.f5686c == c1062ll.f5686c && this.f5687d == c1062ll.f5687d && AbstractC3367j.m5096a(this.f5688e, c1062ll.f5688e) && AbstractC3367j.m5096a(this.f5689f, c1062ll.f5689f) && AbstractC3367j.m5096a(this.f5690g, c1062ll.f5690g) && AbstractC3367j.m5096a(this.f5691h, c1062ll.f5691h) && AbstractC3367j.m5096a(this.f5692i, c1062ll.f5692i) && AbstractC3367j.m5096a(this.f5693j, c1062ll.f5693j) && AbstractC3367j.m5096a(this.f5694k, c1062ll.f5694k) && AbstractC3367j.m5096a(this.f5695l, c1062ll.f5695l) && AbstractC3367j.m5096a(this.f5696m, c1062ll.f5696m) && AbstractC3367j.m5096a(this.f5697n, c1062ll.f5697n) && AbstractC3367j.m5096a(this.f5698o, c1062ll.f5698o) && AbstractC3367j.m5096a(this.f5699p, c1062ll.f5699p)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5699p.hashCode() + AbstractC0094y0.m176c(this.f5698o, AbstractC0094y0.m175b(AbstractC0094y0.m175b(AbstractC0094y0.m175b(AbstractC0094y0.m175b(AbstractC0094y0.m175b(AbstractC0094y0.m175b(AbstractC0094y0.m175b(AbstractC0094y0.m175b(AbstractC0094y0.m175b(AbstractC0094y0.m176c(this.f5688e, (this.f5687d.hashCode() + ((this.f5686c.hashCode() + ((this.f5685b.hashCode() + (Boolean.hashCode(this.f5684a) * 31)) * 31)) * 31)) * 31, 31), 31, this.f5689f), 31, this.f5690g), 31, this.f5691h), 31, this.f5692i), 31, this.f5693j), 31, this.f5694k), 31, this.f5695l), 31, this.f5696m), 31, this.f5697n), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NatTypeSnapshot(running=");
        sb.append(this.f5684a);
        sb.append(", rfcMode=");
        sb.append(this.f5685b);
        sb.append(", addressFamily=");
        sb.append(this.f5686c);
        sb.append(", transport=");
        sb.append(this.f5687d);
        sb.append(", transports=");
        sb.append(this.f5688e);
        sb.append(", server=");
        sb.append(this.f5689f);
        sb.append(", localEndpoint=");
        AbstractC2487d.m4057u(sb, this.f5690g, ", publicEndpoint=", this.f5691h, ", otherEndpoint=");
        AbstractC2487d.m4057u(sb, this.f5692i, ", natType=", this.f5693j, ", bindingResult=");
        AbstractC2487d.m4057u(sb, this.f5694k, ", mappingBehavior=", this.f5695l, ", filteringBehavior=");
        AbstractC2487d.m4057u(sb, this.f5696m, ", status=", this.f5697n, ", results=");
        sb.append(this.f5698o);
        sb.append(", events=");
        sb.append(this.f5699p);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C1062ll(EnumC1495zk enumC1495zk, EnumC1402wk enumC1402wk, EnumC0748bl enumC0748bl, List list, int i7) {
        this(r3, r4, r5, r6, r7, "", "", "", "", "--", "--", "--", "--", r16, r17, r17);
        String str;
        boolean z7 = (i7 & 1) == 0;
        EnumC1495zk enumC1495zk2 = (i7 & 2) != 0 ? EnumC1495zk.f9911g : enumC1495zk;
        EnumC1402wk enumC1402wk2 = (i7 & 4) != 0 ? EnumC1402wk.f8483f : enumC1402wk;
        int i8 = i7 & 8;
        EnumC0748bl enumC0748bl2 = EnumC0748bl.f2838f;
        EnumC0748bl enumC0748bl3 = i8 != 0 ? enumC0748bl2 : enumC0748bl;
        List m5817z = (i7 & 16) != 0 ? AbstractC3784a.m5817z(enumC0748bl2) : list;
        if ((i7 & 8192) != 0) {
            str = "就绪";
        } else {
            str = "正在解析 STUN 服务器...";
        }
        String str2 = str;
        C1813u c1813u = C1813u.f10860e;
    }
}
