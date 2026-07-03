package p039e5;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p001a0.AbstractC0094y0;
import p060h5.C1813u;
import p060h5.C1814v;
import p092m.AbstractC2487d;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.a8 */
/* loaded from: classes.dex */
public final class C0703a8 {

    /* renamed from: a */
    public final boolean f2334a;

    /* renamed from: b */
    public final String f2335b;

    /* renamed from: c */
    public final String f2336c;

    /* renamed from: d */
    public final String f2337d;

    /* renamed from: e */
    public final List f2338e;

    /* renamed from: f */
    public final List f2339f;

    /* renamed from: g */
    public final C0877fn f2340g;

    /* renamed from: h */
    public final Map f2341h;

    /* renamed from: i */
    public final boolean f2342i;

    /* renamed from: j */
    public final boolean f2343j;

    /* renamed from: k */
    public final String f2344k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C0703a8(String str, String str2, List list, List list2, C0877fn c0877fn, int i7) {
        this(r2, r3, r4, "", r14 != 0 ? r15 : list, (i7 & 32) != 0 ? r15 : list2, (i7 & 64) != 0 ? null : c0877fn, C1814v.f10861e, false, false, "");
        boolean z7 = (i7 & 1) == 0;
        String str3 = (i7 & 2) != 0 ? "" : str;
        String str4 = (i7 & 4) != 0 ? "就绪" : str2;
        int i8 = i7 & 16;
        C1813u c1813u = C1813u.f10860e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.Map] */
    /* renamed from: a */
    public static C0703a8 m1494a(C0703a8 c0703a8, String str, LinkedHashMap linkedHashMap, boolean z7, String str2, int i7) {
        boolean z8;
        String str3;
        String str4;
        LinkedHashMap linkedHashMap2;
        boolean z9;
        boolean z10;
        String str5;
        if ((i7 & 1) != 0) {
            z8 = c0703a8.f2334a;
        } else {
            z8 = false;
        }
        boolean z11 = z8;
        String str6 = c0703a8.f2335b;
        if ((i7 & 4) != 0) {
            str3 = c0703a8.f2336c;
        } else {
            str3 = "已取消";
        }
        String str7 = str3;
        if ((i7 & 8) != 0) {
            str4 = c0703a8.f2337d;
        } else {
            str4 = str;
        }
        List list = c0703a8.f2338e;
        List list2 = c0703a8.f2339f;
        C0877fn c0877fn = c0703a8.f2340g;
        if ((i7 & 128) != 0) {
            linkedHashMap2 = c0703a8.f2341h;
        } else {
            linkedHashMap2 = linkedHashMap;
        }
        if ((i7 & 256) != 0) {
            z9 = c0703a8.f2342i;
        } else {
            z9 = z7;
        }
        if ((i7 & 512) != 0) {
            z10 = c0703a8.f2343j;
        } else {
            z10 = true;
        }
        boolean z12 = z10;
        if ((i7 & 1024) != 0) {
            str5 = c0703a8.f2344k;
        } else {
            str5 = str2;
        }
        c0703a8.getClass();
        AbstractC3367j.m5100e(str6, "query");
        AbstractC3367j.m5100e(str7, "status");
        AbstractC3367j.m5100e(str4, "progress");
        AbstractC3367j.m5100e(list, "systemResults");
        AbstractC3367j.m5100e(list2, "customResults");
        AbstractC3367j.m5100e(linkedHashMap2, "geoByAddress");
        AbstractC3367j.m5100e(str5, "geoStatus");
        return new C0703a8(z11, str6, str7, str4, list, list2, c0877fn, linkedHashMap2, z9, z12, str5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0703a8)) {
            return false;
        }
        C0703a8 c0703a8 = (C0703a8) obj;
        if (this.f2334a == c0703a8.f2334a && AbstractC3367j.m5096a(this.f2335b, c0703a8.f2335b) && AbstractC3367j.m5096a(this.f2336c, c0703a8.f2336c) && AbstractC3367j.m5096a(this.f2337d, c0703a8.f2337d) && AbstractC3367j.m5096a(this.f2338e, c0703a8.f2338e) && AbstractC3367j.m5096a(this.f2339f, c0703a8.f2339f) && AbstractC3367j.m5096a(this.f2340g, c0703a8.f2340g) && AbstractC3367j.m5096a(this.f2341h, c0703a8.f2341h) && this.f2342i == c0703a8.f2342i && this.f2343j == c0703a8.f2343j && AbstractC3367j.m5096a(this.f2344k, c0703a8.f2344k)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int m176c = AbstractC0094y0.m176c(this.f2339f, AbstractC0094y0.m176c(this.f2338e, AbstractC0094y0.m175b(AbstractC0094y0.m175b(AbstractC0094y0.m175b(Boolean.hashCode(this.f2334a) * 31, 31, this.f2335b), 31, this.f2336c), 31, this.f2337d), 31), 31);
        C0877fn c0877fn = this.f2340g;
        if (c0877fn == null) {
            hashCode = 0;
        } else {
            hashCode = c0877fn.hashCode();
        }
        return this.f2344k.hashCode() + AbstractC2487d.m4040d(AbstractC2487d.m4040d((this.f2341h.hashCode() + ((m176c + hashCode) * 31)) * 31, 31, this.f2342i), 31, this.f2343j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DnsLookupSnapshot(running=");
        sb.append(this.f2334a);
        sb.append(", query=");
        sb.append(this.f2335b);
        sb.append(", status=");
        AbstractC2487d.m4057u(sb, this.f2336c, ", progress=", this.f2337d, ", systemResults=");
        sb.append(this.f2338e);
        sb.append(", customResults=");
        sb.append(this.f2339f);
        sb.append(", directIp=");
        sb.append(this.f2340g);
        sb.append(", geoByAddress=");
        sb.append(this.f2341h);
        sb.append(", geoRunning=");
        sb.append(this.f2342i);
        sb.append(", geoCompleted=");
        sb.append(this.f2343j);
        sb.append(", geoStatus=");
        return AbstractC2487d.m4046j(sb, this.f2344k, ")");
    }

    public C0703a8(boolean z7, String str, String str2, String str3, List list, List list2, C0877fn c0877fn, Map map, boolean z8, boolean z9, String str4) {
        AbstractC3367j.m5100e(str, "query");
        AbstractC3367j.m5100e(str2, "status");
        AbstractC3367j.m5100e(list, "systemResults");
        AbstractC3367j.m5100e(list2, "customResults");
        AbstractC3367j.m5100e(map, "geoByAddress");
        AbstractC3367j.m5100e(str4, "geoStatus");
        this.f2334a = z7;
        this.f2335b = str;
        this.f2336c = str2;
        this.f2337d = str3;
        this.f2338e = list;
        this.f2339f = list2;
        this.f2340g = c0877fn;
        this.f2341h = map;
        this.f2342i = z8;
        this.f2343j = z9;
        this.f2344k = str4;
    }
}
