package p039e5;

import p105n5.C2719b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.jo */
/* loaded from: classes.dex */
public final class EnumC1003jo {

    /* renamed from: f */
    public static final EnumC1003jo f5116f;

    /* renamed from: g */
    public static final EnumC1003jo f5117g;

    /* renamed from: h */
    public static final /* synthetic */ EnumC1003jo[] f5118h;

    /* renamed from: i */
    public static final /* synthetic */ C2719b f5119i;

    /* renamed from: e */
    public final String f5120e;

    static {
        EnumC1003jo enumC1003jo = new EnumC1003jo(0, "Off", "关闭");
        f5116f = enumC1003jo;
        EnumC1003jo enumC1003jo2 = new EnumC1003jo(1, "Auto", "自动最低延迟");
        f5117g = enumC1003jo2;
        EnumC1003jo[] enumC1003joArr = {enumC1003jo, enumC1003jo2, new EnumC1003jo(2, "Manual", "弹窗选择")};
        f5118h = enumC1003joArr;
        f5119i = new C2719b(enumC1003joArr);
    }

    public EnumC1003jo(int i7, String str, String str2) {
        this.f5120e = str2;
    }

    public static EnumC1003jo valueOf(String str) {
        return (EnumC1003jo) Enum.valueOf(EnumC1003jo.class, str);
    }

    public static EnumC1003jo[] values() {
        return (EnumC1003jo[]) f5118h.clone();
    }
}
