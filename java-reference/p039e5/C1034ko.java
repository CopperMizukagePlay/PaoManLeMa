package p039e5;

import java.util.List;
import p001a0.AbstractC0094y0;
import p092m.AbstractC2487d;
import p100n.AbstractC2647h;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ko */
/* loaded from: classes.dex */
public final class C1034ko {

    /* renamed from: a */
    public final boolean f5318a;

    /* renamed from: b */
    public final boolean f5319b;

    /* renamed from: c */
    public final List f5320c;

    /* renamed from: d */
    public final int f5321d;

    /* renamed from: e */
    public final int f5322e;

    /* renamed from: f */
    public final boolean f5323f;

    /* renamed from: g */
    public final List f5324g;

    /* renamed from: h */
    public final EnumC1127no f5325h;

    public C1034ko(boolean z7, boolean z8, List list, int i7, int i8, boolean z9, List list2, EnumC1127no enumC1127no) {
        AbstractC3367j.m5100e(list2, "ecsSubnets");
        AbstractC3367j.m5100e(enumC1127no, "networkMode");
        this.f5318a = z7;
        this.f5319b = z8;
        this.f5320c = list;
        this.f5321d = i7;
        this.f5322e = i8;
        this.f5323f = z9;
        this.f5324g = list2;
        this.f5325h = enumC1127no;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1034ko)) {
            return false;
        }
        C1034ko c1034ko = (C1034ko) obj;
        if (this.f5318a == c1034ko.f5318a && this.f5319b == c1034ko.f5319b && AbstractC3367j.m5096a(this.f5320c, c1034ko.f5320c) && this.f5321d == c1034ko.f5321d && this.f5322e == c1034ko.f5322e && this.f5323f == c1034ko.f5323f && AbstractC3367j.m5096a(this.f5324g, c1034ko.f5324g) && this.f5325h == c1034ko.f5325h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5325h.hashCode() + AbstractC0094y0.m176c(this.f5324g, AbstractC2487d.m4040d(AbstractC2647h.m4255a(this.f5322e, AbstractC2647h.m4255a(this.f5321d, AbstractC0094y0.m176c(this.f5320c, AbstractC2487d.m4040d(Boolean.hashCode(this.f5318a) * 31, 31, this.f5319b), 31), 31), 31), 31, this.f5323f), 31);
    }

    public final String toString() {
        return "SpeedDnsSettingsSnapshot(useSystemDns=" + this.f5318a + ", customDnsEnabled=" + this.f5319b + ", servers=" + this.f5320c + ", timeoutMs=" + this.f5321d + ", retryCount=" + this.f5322e + ", ecsEnabled=" + this.f5323f + ", ecsSubnets=" + this.f5324g + ", networkMode=" + this.f5325h + ")";
    }
}
