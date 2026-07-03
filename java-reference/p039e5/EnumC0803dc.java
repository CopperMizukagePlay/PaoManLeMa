package p039e5;

import p105n5.C2719b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.dc */
/* loaded from: classes.dex */
public final class EnumC0803dc {

    /* renamed from: f */
    public static final EnumC0803dc f3385f;

    /* renamed from: g */
    public static final EnumC0803dc f3386g;

    /* renamed from: h */
    public static final EnumC0803dc f3387h;

    /* renamed from: i */
    public static final /* synthetic */ EnumC0803dc[] f3388i;

    /* renamed from: j */
    public static final /* synthetic */ C2719b f3389j;

    /* renamed from: e */
    public final String f3390e;

    static {
        EnumC0803dc enumC0803dc = new EnumC0803dc(0, "FORWARD", "正向（客户端上传）");
        f3385f = enumC0803dc;
        EnumC0803dc enumC0803dc2 = new EnumC0803dc(1, "REVERSE", "反向（客户端下载）");
        f3386g = enumC0803dc2;
        EnumC0803dc enumC0803dc3 = new EnumC0803dc(2, "BIDIR", "双向");
        f3387h = enumC0803dc3;
        EnumC0803dc[] enumC0803dcArr = {enumC0803dc, enumC0803dc2, enumC0803dc3};
        f3388i = enumC0803dcArr;
        f3389j = new C2719b(enumC0803dcArr);
    }

    public EnumC0803dc(int i7, String str, String str2) {
        this.f3390e = str2;
    }

    public static EnumC0803dc valueOf(String str) {
        return (EnumC0803dc) Enum.valueOf(EnumC0803dc.class, str);
    }

    public static EnumC0803dc[] values() {
        return (EnumC0803dc[]) f3388i.clone();
    }
}
