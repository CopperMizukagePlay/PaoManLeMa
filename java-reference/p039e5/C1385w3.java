package p039e5;

import android.content.Context;
import p001a0.AbstractC0094y0;
import p024c6.AbstractC0444k;
import p024c6.AbstractC0451r;
import p053g5.C1694m;
import p073j2.AbstractC2168e;
import p085l0.InterfaceC2425y0;
import p144t.AbstractC3122c;
import p144t.C3137j0;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p190z.C3860d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.w3 */
/* loaded from: classes.dex */
public final /* synthetic */ class C1385w3 implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ int f8291e;

    /* renamed from: f */
    public final /* synthetic */ Context f8292f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC2425y0 f8293g;

    public /* synthetic */ C1385w3(Context context, InterfaceC2425y0 interfaceC2425y0, int i7) {
        this.f8291e = i7;
        this.f8292f = context;
        this.f8293g = interfaceC2425y0;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        int i7 = this.f8291e;
        final int i8 = 3;
        Integer num = null;
        Context context = this.f8292f;
        C1694m c1694m = C1694m.f10482a;
        int i9 = 0;
        InterfaceC2425y0 interfaceC2425y0 = this.f8293g;
        switch (i7) {
            case 0:
                String str = (String) obj;
                AbstractC3367j.m5100e(str, "it");
                StringBuilder sb = new StringBuilder();
                int length = str.length();
                for (int i10 = 0; i10 < length; i10++) {
                    char charAt = str.charAt(i10);
                    if (Character.isDigit(charAt)) {
                        sb.append(charAt);
                    }
                }
                interfaceC2425y0.setValue(AbstractC0444k.m955s0(sb.toString(), 5));
                String str2 = (String) interfaceC2425y0.getValue();
                AbstractC3367j.m5100e(context, "context");
                AbstractC3367j.m5100e(str2, "value");
                context.getSharedPreferences("speed_test_profiles", 0).edit().putString("diag_nat_timeout_ms", str2).apply();
                return c1694m;
            case 1:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                interfaceC2425y0.setValue(bool);
                AbstractC3367j.m5100e(context, "context");
                context.getSharedPreferences("speed_test_profiles", 0).edit().putBoolean("diag_nat_use_speed_dns", booleanValue).apply();
                return c1694m;
            case 2:
                Boolean bool2 = (Boolean) obj;
                boolean booleanValue2 = bool2.booleanValue();
                C3137j0 c3137j0 = AbstractC1172p7.f6835a;
                interfaceC2425y0.setValue(bool2);
                AbstractC0094y0.m177d(context, "context", "speed_test_profiles", 0).putBoolean("diag_trace_use_speed_dns", booleanValue2).apply();
                return c1694m;
            case 3:
                String str3 = (String) obj;
                AbstractC3367j.m5100e(str3, "it");
                C3137j0 c3137j02 = AbstractC1172p7.f6835a;
                interfaceC2425y0.setValue(str3);
                AbstractC0094y0.m177d(context, "context", "speed_test_profiles", 0).putString("diag_ping_network_id", str3).apply();
                return c1694m;
            case 4:
                String str4 = (String) obj;
                AbstractC3367j.m5100e(str4, "it");
                C3137j0 c3137j03 = AbstractC1172p7.f6835a;
                interfaceC2425y0.setValue(str4);
                AbstractC0094y0.m177d(context, "context", "speed_test_profiles", 0).putString("diag_session_limit_network_id", str4).apply();
                return c1694m;
            case AbstractC3122c.f15761f /* 5 */:
                String str5 = (String) obj;
                AbstractC3367j.m5100e(str5, "it");
                C3137j0 c3137j04 = AbstractC1172p7.f6835a;
                interfaceC2425y0.setValue(str5);
                AbstractC0094y0.m177d(context, "context", "speed_test_profiles", 0).putString("diag_trace_network_id", str5).apply();
                return c1694m;
            case AbstractC3122c.f15759d /* 6 */:
                String str6 = (String) obj;
                AbstractC3367j.m5100e(str6, "it");
                C3137j0 c3137j05 = AbstractC1172p7.f6835a;
                interfaceC2425y0.setValue(str6);
                AbstractC0094y0.m177d(context, "context", "speed_test_profiles", 0).putString("diag_dns_network_id", str6).apply();
                return c1694m;
            case 7:
                String str7 = (String) obj;
                AbstractC3367j.m5100e(str7, "it");
                C3137j0 c3137j06 = AbstractC1172p7.f6835a;
                interfaceC2425y0.setValue(str7);
                AbstractC0094y0.m177d(context, "context", "speed_test_profiles", 0).putString("diag_nat_network_id", str7).apply();
                return c1694m;
            case 8:
                EnumC1402wk enumC1402wk = (EnumC1402wk) obj;
                AbstractC3367j.m5100e(enumC1402wk, "it");
                C3137j0 c3137j07 = AbstractC1172p7.f6835a;
                interfaceC2425y0.setValue(enumC1402wk);
                AbstractC0094y0.m177d(context, "context", "speed_test_profiles", 0).putString("diag_nat_address_family", enumC1402wk.name()).apply();
                return c1694m;
            case AbstractC3122c.f15758c /* 9 */:
                Boolean bool3 = (Boolean) obj;
                boolean booleanValue3 = bool3.booleanValue();
                C3137j0 c3137j08 = AbstractC1172p7.f6835a;
                interfaceC2425y0.setValue(bool3);
                AbstractC0094y0.m177d(context, "context", "speed_test_profiles", 0).putBoolean("diag_ping_use_speed_dns", booleanValue3).apply();
                return c1694m;
            case AbstractC3122c.f15760e /* 10 */:
                EnumC0844em enumC0844em = (EnumC0844em) obj;
                AbstractC3367j.m5100e(enumC0844em, "mode");
                C3137j0 c3137j09 = AbstractC1172p7.f6835a;
                interfaceC2425y0.setValue(enumC0844em);
                AbstractC0094y0.m177d(context, "context", "speed_test_profiles", 0).putString("diag_ping_chart_range", enumC0844em.name()).apply();
                return c1694m;
            case 11:
                String str8 = (String) obj;
                AbstractC3367j.m5100e(str8, "it");
                C3137j0 c3137j010 = AbstractC1172p7.f6835a;
                interfaceC2425y0.setValue(str8);
                AbstractC0094y0.m177d(context, "context", "speed_test_profiles", 0).putString("diag_session_limit_target", AbstractC0444k.m956t0(str8).toString()).apply();
                return c1694m;
            case 12:
                String str9 = (String) obj;
                AbstractC3367j.m5100e(str9, "it");
                StringBuilder sb2 = new StringBuilder();
                int length2 = str9.length();
                for (int i11 = 0; i11 < length2; i11++) {
                    char charAt2 = str9.charAt(i11);
                    if (Character.isDigit(charAt2)) {
                        sb2.append(charAt2);
                    }
                }
                String m955s0 = AbstractC0444k.m955s0(sb2.toString(), 5);
                C3137j0 c3137j011 = AbstractC1172p7.f6835a;
                interfaceC2425y0.setValue(m955s0);
                String str10 = (String) interfaceC2425y0.getValue();
                AbstractC3367j.m5100e(context, "context");
                AbstractC3367j.m5100e(str10, "value");
                context.getSharedPreferences("speed_test_profiles", 0).edit().putString("diag_session_limit_port", str10).apply();
                return c1694m;
            case 13:
                String str11 = (String) obj;
                AbstractC3367j.m5100e(str11, "it");
                C3137j0 c3137j012 = AbstractC1172p7.f6835a;
                interfaceC2425y0.setValue(str11);
                AbstractC0094y0.m177d(context, "context", "speed_test_profiles", 0).putString("diag_session_limit_max", str11).apply();
                return c1694m;
            case 14:
                String str12 = (String) obj;
                AbstractC3367j.m5100e(str12, "it");
                C3137j0 c3137j013 = AbstractC1172p7.f6835a;
                interfaceC2425y0.setValue(str12);
                AbstractC0094y0.m177d(context, "context", "speed_test_profiles", 0).putString("diag_session_limit_batch", str12).apply();
                return c1694m;
            case AbstractC3122c.f15762g /* 15 */:
                String str13 = (String) obj;
                AbstractC3367j.m5100e(str13, "it");
                C3137j0 c3137j014 = AbstractC1172p7.f6835a;
                interfaceC2425y0.setValue(str13);
                AbstractC0094y0.m177d(context, "context", "speed_test_profiles", 0).putString("diag_session_limit_failure_threshold", str13).apply();
                return c1694m;
            case 16:
                String str14 = (String) obj;
                AbstractC3367j.m5100e(str14, "it");
                C3137j0 c3137j015 = AbstractC1172p7.f6835a;
                interfaceC2425y0.setValue(str14);
                AbstractC0094y0.m177d(context, "context", "speed_test_profiles", 0).putString("diag_session_limit_timeout_ms", str14).apply();
                return c1694m;
            case 17:
                String str15 = (String) obj;
                AbstractC3367j.m5100e(str15, "it");
                C3137j0 c3137j016 = AbstractC1172p7.f6835a;
                interfaceC2425y0.setValue(str15);
                AbstractC0094y0.m177d(context, "context", "speed_test_profiles", 0).putString("diag_session_limit_launch_delay_ms", str15).apply();
                return c1694m;
            case 18:
                Boolean bool4 = (Boolean) obj;
                boolean booleanValue4 = bool4.booleanValue();
                C3137j0 c3137j017 = AbstractC1172p7.f6835a;
                interfaceC2425y0.setValue(bool4);
                AbstractC0094y0.m177d(context, "context", "speed_test_profiles", 0).putBoolean("diag_session_limit_use_speed_dns", booleanValue4).apply();
                return c1694m;
            case 19:
                String str16 = (String) obj;
                AbstractC3367j.m5100e(str16, "it");
                C3860d c3860d = AbstractC1328u8.f7898a;
                interfaceC2425y0.setValue(str16);
                AbstractC0094y0.m177d(context, "context", "speed_test_profiles", 0).putString("diag_dns_query", str16).apply();
                return c1694m;
            case 20:
                Boolean bool5 = (Boolean) obj;
                boolean booleanValue5 = bool5.booleanValue();
                C3860d c3860d2 = AbstractC1328u8.f7898a;
                interfaceC2425y0.setValue(bool5);
                AbstractC0094y0.m177d(context, "context", "speed_test_profiles", 0).putBoolean("diag_dns_use_speed_dns", booleanValue5).apply();
                return c1694m;
            case 21:
                Boolean bool6 = (Boolean) obj;
                boolean booleanValue6 = bool6.booleanValue();
                C3860d c3860d3 = AbstractC1328u8.f7898a;
                interfaceC2425y0.setValue(bool6);
                AbstractC0094y0.m177d(context, "context", "speed_test_profiles", 0).putBoolean("diag_dns_use_speed_ecs", booleanValue6).apply();
                return c1694m;
            case 22:
                Boolean bool7 = (Boolean) obj;
                boolean booleanValue7 = bool7.booleanValue();
                C3860d c3860d4 = AbstractC1328u8.f7898a;
                interfaceC2425y0.setValue(bool7);
                AbstractC0094y0.m177d(context, "context", "speed_test_profiles", 0).putBoolean("diag_dns_page_dns_enabled", booleanValue7).apply();
                return c1694m;
            case 23:
                Boolean bool8 = (Boolean) obj;
                boolean booleanValue8 = bool8.booleanValue();
                C3860d c3860d5 = AbstractC1328u8.f7898a;
                interfaceC2425y0.setValue(bool8);
                AbstractC0094y0.m177d(context, "context", "speed_test_profiles", 0).putBoolean("diag_dns_page_ecs_enabled", booleanValue8).apply();
                return c1694m;
            case 24:
                String str17 = (String) obj;
                AbstractC3367j.m5100e(str17, "value");
                if (str17.length() <= 2) {
                    while (true) {
                        if (i9 < str17.length()) {
                            if (Character.isDigit(str17.charAt(i9))) {
                                i9++;
                            }
                        } else {
                            interfaceC2425y0.setValue(str17);
                            Integer m973O = AbstractC0451r.m973O(str17);
                            if (m973O != null) {
                                int intValue = m973O.intValue();
                                if (1 <= intValue && intValue < 33) {
                                    num = m973O;
                                }
                                if (num != null) {
                                    C0927h9.m1553c(this.f8292f, null, num.intValue(), 0, null, 0, 0, null, 250);
                                }
                            }
                        }
                    }
                }
                return c1694m;
            case 25:
                String str18 = (String) obj;
                AbstractC3367j.m5100e(str18, "value");
                if (str18.length() <= 3) {
                    while (true) {
                        if (i9 < str18.length()) {
                            if (Character.isDigit(str18.charAt(i9))) {
                                i9++;
                            }
                        } else {
                            interfaceC2425y0.setValue(str18);
                            Integer m973O2 = AbstractC0451r.m973O(str18);
                            if (m973O2 != null) {
                                int intValue2 = m973O2.intValue();
                                if (1 <= intValue2 && intValue2 < 513) {
                                    num = m973O2;
                                }
                                if (num != null) {
                                    C0927h9.m1553c(this.f8292f, null, 0, num.intValue(), null, 0, 0, null, 246);
                                }
                            }
                        }
                    }
                }
                return c1694m;
            case 26:
                String str19 = (String) obj;
                AbstractC3367j.m5100e(str19, "value");
                if (str19.length() <= 4) {
                    while (true) {
                        if (i9 < str19.length()) {
                            if (Character.isDigit(str19.charAt(i9))) {
                                i9++;
                            }
                        } else {
                            interfaceC2425y0.setValue(str19);
                            Integer m973O3 = AbstractC0451r.m973O(str19);
                            if (m973O3 != null) {
                                int intValue3 = m973O3.intValue();
                                if (8 <= intValue3 && intValue3 < 1025) {
                                    num = m973O3;
                                }
                                if (num != null) {
                                    C0927h9.m1553c(this.f8292f, null, 0, 0, null, num.intValue(), 0, null, 222);
                                }
                            }
                        }
                    }
                }
                return c1694m;
            case 27:
                String str20 = (String) obj;
                AbstractC3367j.m5100e(str20, "value");
                if (str20.length() <= 3) {
                    while (true) {
                        if (i9 < str20.length()) {
                            if (Character.isDigit(str20.charAt(i9))) {
                                i9++;
                            }
                        } else {
                            interfaceC2425y0.setValue(str20);
                            Integer m973O4 = AbstractC0451r.m973O(str20);
                            if (m973O4 != null) {
                                int intValue4 = m973O4.intValue();
                                if (intValue4 >= 0 && intValue4 < 129) {
                                    num = m973O4;
                                }
                                if (num != null) {
                                    C0927h9.m1553c(this.f8292f, null, 0, 0, null, 0, num.intValue(), null, 190);
                                }
                            }
                        }
                    }
                }
                return c1694m;
            case 28:
                boolean booleanValue9 = ((Boolean) obj).booleanValue();
                C0927h9 c0927h9 = C0927h9.f4481a;
                if (booleanValue9) {
                    i8 = 0;
                } else {
                    Integer m973O5 = AbstractC0451r.m973O((String) interfaceC2425y0.getValue());
                    if (m973O5 != null) {
                        i8 = AbstractC2168e.m3530q(m973O5.intValue(), 1, 20);
                    }
                }
                c0927h9.m1556d(context, new InterfaceC3279c() { // from class: e5.g9
                    @Override // p150t5.InterfaceC3279c
                    /* renamed from: f */
                    public final Object mo23f(Object obj2) {
                        C0959i9 c0959i9 = (C0959i9) obj2;
                        AbstractC3367j.m5100e(c0959i9, "it");
                        return C0959i9.m1601a(c0959i9, null, false, null, 0, 0, null, 0, 0, null, false, false, AbstractC2168e.m3530q(i8, 0, 20), 2047);
                    }
                });
                return c1694m;
            default:
                String str21 = (String) obj;
                AbstractC3367j.m5100e(str21, "value");
                if (str21.length() <= 2) {
                    while (true) {
                        if (i9 < str21.length()) {
                            if (Character.isDigit(str21.charAt(i9))) {
                                i9++;
                            }
                        } else {
                            interfaceC2425y0.setValue(str21);
                            Integer m973O6 = AbstractC0451r.m973O(str21);
                            if (m973O6 != null) {
                                int intValue5 = m973O6.intValue();
                                if (1 <= intValue5 && intValue5 < 21) {
                                    num = m973O6;
                                }
                                if (num != null) {
                                    final int intValue6 = num.intValue();
                                    C0927h9.f4481a.m1556d(context, new InterfaceC3279c() { // from class: e5.g9
                                        @Override // p150t5.InterfaceC3279c
                                        /* renamed from: f */
                                        public final Object mo23f(Object obj2) {
                                            C0959i9 c0959i9 = (C0959i9) obj2;
                                            AbstractC3367j.m5100e(c0959i9, "it");
                                            return C0959i9.m1601a(c0959i9, null, false, null, 0, 0, null, 0, 0, null, false, false, AbstractC2168e.m3530q(intValue6, 0, 20), 2047);
                                        }
                                    });
                                }
                            }
                        }
                    }
                }
                return c1694m;
        }
    }

    public /* synthetic */ C1385w3(InterfaceC2425y0 interfaceC2425y0, Context context, int i7) {
        this.f8291e = i7;
        this.f8293g = interfaceC2425y0;
        this.f8292f = context;
    }
}
