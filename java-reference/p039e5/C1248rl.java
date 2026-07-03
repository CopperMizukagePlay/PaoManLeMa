package p039e5;

import android.net.Network;
import p001a0.AbstractC0094y0;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.rl */
/* loaded from: classes.dex */
public final class C1248rl {

    /* renamed from: a */
    public final String f7390a;

    /* renamed from: b */
    public final String f7391b;

    /* renamed from: c */
    public final Network f7392c;

    /* renamed from: d */
    public final EnumC1070lt f7393d;

    /* renamed from: e */
    public final String f7394e;

    /* renamed from: f */
    public final String f7395f;

    public C1248rl(String str, String str2, Network network, EnumC1070lt enumC1070lt, String str3, String str4) {
        AbstractC3367j.m5100e(enumC1070lt, "transport");
        this.f7390a = str;
        this.f7391b = str2;
        this.f7392c = network;
        this.f7393d = enumC1070lt;
        this.f7394e = str3;
        this.f7395f = str4;
    }

    /* renamed from: a */
    public static C1248rl m2204a(C1248rl c1248rl, String str, String str2, Network network, String str3, int i7) {
        if ((i7 & 1) != 0) {
            str = c1248rl.f7390a;
        }
        String str4 = str;
        if ((i7 & 2) != 0) {
            str2 = c1248rl.f7391b;
        }
        String str5 = str2;
        if ((i7 & 4) != 0) {
            network = c1248rl.f7392c;
        }
        Network network2 = network;
        EnumC1070lt enumC1070lt = c1248rl.f7393d;
        String str6 = c1248rl.f7394e;
        if ((i7 & 32) != 0) {
            str3 = c1248rl.f7395f;
        }
        c1248rl.getClass();
        AbstractC3367j.m5100e(str4, "id");
        AbstractC3367j.m5100e(str5, "name");
        AbstractC3367j.m5100e(enumC1070lt, "transport");
        return new C1248rl(str4, str5, network2, enumC1070lt, str6, str3);
    }

    /* renamed from: b */
    public final String m2205b() {
        return this.f7390a;
    }

    /* renamed from: c */
    public final Network m2206c() {
        return this.f7392c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1248rl)) {
            return false;
        }
        C1248rl c1248rl = (C1248rl) obj;
        if (AbstractC3367j.m5096a(this.f7390a, c1248rl.f7390a) && AbstractC3367j.m5096a(this.f7391b, c1248rl.f7391b) && AbstractC3367j.m5096a(this.f7392c, c1248rl.f7392c) && this.f7393d == c1248rl.f7393d && AbstractC3367j.m5096a(this.f7394e, c1248rl.f7394e) && AbstractC3367j.m5096a(this.f7395f, c1248rl.f7395f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int m175b = AbstractC0094y0.m175b(this.f7390a.hashCode() * 31, 31, this.f7391b);
        int i7 = 0;
        Network network = this.f7392c;
        if (network == null) {
            hashCode = 0;
        } else {
            hashCode = network.hashCode();
        }
        int hashCode3 = (this.f7393d.hashCode() + ((m175b + hashCode) * 31)) * 31;
        String str = this.f7394e;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i8 = (hashCode3 + hashCode2) * 31;
        String str2 = this.f7395f;
        if (str2 != null) {
            i7 = str2.hashCode();
        }
        return i8 + i7;
    }

    public final String toString() {
        StringBuilder m189p = AbstractC0094y0.m189p("NetworkTarget(id=", this.f7390a, ", name=", this.f7391b, ", network=");
        m189p.append(this.f7392c);
        m189p.append(", transport=");
        m189p.append(this.f7393d);
        m189p.append(", interfaceName=");
        m189p.append(this.f7394e);
        m189p.append(", linkSpeedLabel=");
        m189p.append(this.f7395f);
        m189p.append(")");
        return m189p.toString();
    }

    public /* synthetic */ C1248rl(String str, String str2, Network network, EnumC1070lt enumC1070lt, String str3, int i7) {
        this(str, str2, (i7 & 4) != 0 ? null : network, (i7 & 8) != 0 ? EnumC1070lt.f5748i : enumC1070lt, (i7 & 16) != 0 ? null : str3, (String) null);
    }
}
