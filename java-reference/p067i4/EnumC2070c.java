package p067i4;

import java.nio.charset.Charset;
import java.util.HashMap;
import p022c4.C0396f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i4.c */
/* loaded from: classes.dex */
public enum EnumC2070c {
    /* JADX INFO: Fake field, exist only in values array */
    Cp437(new int[]{0, 2}, new String[0]),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_1(new int[]{1, 3}, "ISO-8859-1"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_2(4, "ISO-8859-2"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_3(5, "ISO-8859-3"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_4(6, "ISO-8859-4"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_5(7, "ISO-8859-5"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_6(8, "ISO-8859-6"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_7(9, "ISO-8859-7"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_8(10, "ISO-8859-8"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_9(11, "ISO-8859-9"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_10(12, "ISO-8859-10"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_11(13, "ISO-8859-11"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_13(15, "ISO-8859-13"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_14(16, "ISO-8859-14"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_15(17, "ISO-8859-15"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_16(18, "ISO-8859-16"),
    /* JADX INFO: Fake field, exist only in values array */
    SJIS(20, "Shift_JIS"),
    /* JADX INFO: Fake field, exist only in values array */
    Cp1250(21, "windows-1250"),
    /* JADX INFO: Fake field, exist only in values array */
    Cp1251(22, "windows-1251"),
    /* JADX INFO: Fake field, exist only in values array */
    Cp1252(23, "windows-1252"),
    /* JADX INFO: Fake field, exist only in values array */
    Cp1256(24, "windows-1256"),
    /* JADX INFO: Fake field, exist only in values array */
    UnicodeBigUnmarked(25, "UTF-16BE", "UnicodeBig"),
    /* JADX INFO: Fake field, exist only in values array */
    UTF8(26, "UTF-8"),
    /* JADX INFO: Fake field, exist only in values array */
    ASCII(new int[]{27, 170}, "US-ASCII"),
    /* JADX INFO: Fake field, exist only in values array */
    Big5(new int[]{28}, new String[0]),
    /* JADX INFO: Fake field, exist only in values array */
    GB18030(29, "GB2312", "EUC_CN", "GBK"),
    /* JADX INFO: Fake field, exist only in values array */
    EUC_KR(30, "EUC-KR");


    /* renamed from: g */
    public static final HashMap f12262g = new HashMap();

    /* renamed from: h */
    public static final HashMap f12263h = new HashMap();

    /* renamed from: e */
    public final int[] f12265e;

    /* renamed from: f */
    public final String[] f12266f;

    static {
        for (EnumC2070c enumC2070c : values()) {
            if (Charset.isSupported(enumC2070c.name())) {
                for (int i7 : enumC2070c.f12265e) {
                    f12262g.put(Integer.valueOf(i7), enumC2070c);
                }
                f12263h.put(enumC2070c.name(), enumC2070c);
                for (String str : enumC2070c.f12266f) {
                    f12263h.put(str, enumC2070c);
                }
            }
        }
    }

    EnumC2070c(int i7, String... strArr) {
        this.f12265e = new int[]{i7};
        this.f12266f = strArr;
    }

    /* renamed from: a */
    public static EnumC2070c m3321a(int i7) {
        if (i7 >= 0 && i7 < 900) {
            return (EnumC2070c) f12262g.get(Integer.valueOf(i7));
        }
        throw C0396f.m868a();
    }

    EnumC2070c(int[] iArr, String... strArr) {
        this.f12265e = iArr;
        this.f12266f = strArr;
    }
}
