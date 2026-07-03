package p046f5;

import p006a7.C0129l;
import p035e1.AbstractC0659i0;
import p105n5.C2719b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: f5.a */
/* loaded from: classes.dex */
public final class EnumC1536a {

    /* renamed from: j */
    public static final C0129l f10100j;

    /* renamed from: k */
    public static final /* synthetic */ EnumC1536a[] f10101k;

    /* renamed from: l */
    public static final /* synthetic */ C2719b f10102l;

    /* renamed from: e */
    public final String f10103e;

    /* renamed from: f */
    public final String f10104f;

    /* renamed from: g */
    public final long f10105g;

    /* renamed from: h */
    public final long f10106h;

    /* renamed from: i */
    public final long f10107i;

    static {
        EnumC1536a[] enumC1536aArr = {new EnumC1536a("Purple", 0, "purple", "紫色", AbstractC0659i0.m1404d(4284960932L), AbstractC0659i0.m1404d(4291869951L), AbstractC0659i0.m1404d(4284960932L)), new EnumC1536a("Blue", 1, "blue", "蓝色", AbstractC0659i0.m1404d(4279592384L), AbstractC0659i0.m1404d(4287679225L), AbstractC0659i0.m1404d(4279592384L)), new EnumC1536a("Teal", 2, "teal", "青色", AbstractC0659i0.m1404d(4278221163L), AbstractC0659i0.m1404d(4286630852L), AbstractC0659i0.m1404d(4278221163L)), new EnumC1536a("Green", 3, "green", "绿色", AbstractC0659i0.m1404d(4281236786L), AbstractC0659i0.m1404d(4289058471L), AbstractC0659i0.m1404d(4281236786L)), new EnumC1536a("Orange", 4, "orange", "橙色", AbstractC0659i0.m1404d(4293284096L), AbstractC0659i0.m1404d(4294954112L), AbstractC0659i0.m1404d(4293284096L)), new EnumC1536a("Pink", 5, "pink", "粉色", AbstractC0659i0.m1404d(4290910299L), AbstractC0659i0.m1404d(4294217649L), AbstractC0659i0.m1404d(4290910299L)), new EnumC1536a("Red", 6, "red", "红色", AbstractC0659i0.m1404d(4291176488L), AbstractC0659i0.m1404d(4293892762L), AbstractC0659i0.m1404d(4291176488L))};
        f10101k = enumC1536aArr;
        f10102l = new C2719b(enumC1536aArr);
        f10100j = new C0129l(9);
    }

    public EnumC1536a(String str, int i7, String str2, String str3, long j6, long j7, long j8) {
        this.f10103e = str2;
        this.f10104f = str3;
        this.f10105g = j6;
        this.f10106h = j7;
        this.f10107i = j8;
    }

    public static EnumC1536a valueOf(String str) {
        return (EnumC1536a) Enum.valueOf(EnumC1536a.class, str);
    }

    public static EnumC1536a[] values() {
        return (EnumC1536a[]) f10101k.clone();
    }
}
