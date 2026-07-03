package p039e5;

import p001a0.AbstractC0094y0;
import p092m.AbstractC2487d;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.wb */
/* loaded from: classes.dex */
public final class C1393wb {

    /* renamed from: a */
    public final String f8322a;

    /* renamed from: b */
    public final String f8323b;

    /* renamed from: c */
    public final String f8324c;

    public /* synthetic */ C1393wb(int i7, String str, String str2, String str3) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3);
    }

    /* renamed from: a */
    public static C1393wb m2373a(C1393wb c1393wb, int i7) {
        String str;
        String str2;
        String str3 = null;
        if ((i7 & 1) != 0) {
            str = c1393wb.f8322a;
        } else {
            str = null;
        }
        if ((i7 & 2) != 0) {
            str2 = c1393wb.f8323b;
        } else {
            str2 = null;
        }
        if ((i7 & 4) != 0) {
            str3 = c1393wb.f8324c;
        }
        c1393wb.getClass();
        return new C1393wb(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1393wb)) {
            return false;
        }
        C1393wb c1393wb = (C1393wb) obj;
        if (AbstractC3367j.m5096a(this.f8322a, c1393wb.f8322a) && AbstractC3367j.m5096a(this.f8323b, c1393wb.f8323b) && AbstractC3367j.m5096a(this.f8324c, c1393wb.f8324c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i7 = 0;
        String str = this.f8322a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i8 = hashCode * 31;
        String str2 = this.f8323b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i9 = (i8 + hashCode2) * 31;
        String str3 = this.f8324c;
        if (str3 != null) {
            i7 = str3.hashCode();
        }
        return i9 + i7;
    }

    public final String toString() {
        return AbstractC2487d.m4046j(AbstractC0094y0.m189p("InterfaceLinkSpeedDisplay(linkSpeedLabel=", this.f8322a, ", usbBusLabel=", this.f8323b, ", wifiSsidLabel="), this.f8324c, ")");
    }

    public C1393wb(String str, String str2, String str3) {
        this.f8322a = str;
        this.f8323b = str2;
        this.f8324c = str3;
    }
}
