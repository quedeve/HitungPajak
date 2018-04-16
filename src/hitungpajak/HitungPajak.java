/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungpajak;

import java.util.Scanner;

/**
 *
 * @author victo
 */
public class HitungPajak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Penghasilan : ");
        int penghasilan = input.nextInt();
        System.out.println("Status : ");
        String status = input.next();
        hitungPajak(penghasilan, status);
        

    }

    public static void hitungPajak(int Penghasilan, String Status) {
        double totalPajak = 0;
        switch (Status) {
            case "TK0":
                Penghasilan = Penghasilan - 36000000;
                 if (Penghasilan > 0) {

                    if (Penghasilan > 50000000) {
                        totalPajak = totalPajak + (50000000 * 0.05);
                        if (Penghasilan > 300000000) {
                            totalPajak = totalPajak + (250000000 * 0.05);
                            if (Penghasilan > 800000000) {
                                totalPajak = totalPajak + ((Penghasilan - 500000000) * 0.30);
                            } else {
                                totalPajak = totalPajak + ((Penghasilan - 250000000) * 0.25);
                            }
                        } else {
                            totalPajak = totalPajak + ((Penghasilan - 50000000) * 0.15);
                        }
                    } else {
                        totalPajak = Penghasilan * 0.05;
                    }

                } else {
                    totalPajak = 0;
                }
                System.out.println("Total Pajak : " + totalPajak);
                break;
            case "TK1":

                Penghasilan = Penghasilan - 39000000;
                if (Penghasilan > 0) {

                    if (Penghasilan > 50000000) {
                        totalPajak = totalPajak + (50000000 * 0.05);
                        if (Penghasilan > 300000000) {
                            totalPajak = totalPajak + (250000000 * 0.15);
                            if (Penghasilan > 800000000) {
                                totalPajak = totalPajak + ((Penghasilan - 500000000) * 0.30);
                            } else {
                                totalPajak = totalPajak + ((Penghasilan - 250000000) * 0.25);
                            }
                        } else {
                            totalPajak = totalPajak + ((Penghasilan - 50000000) * 0.15);
                        }
                    } else {
                        totalPajak = Penghasilan * 0.05;
                    }

                } else {
                    totalPajak = 0;
                }
                System.out.println("Total Pajak : " + totalPajak);
                break;
            case "TK2":
                Penghasilan = Penghasilan - 42000000;
                if (Penghasilan > 0) {

                    if (Penghasilan > 50000000) {
                        totalPajak = totalPajak + (50000000 * 0.05);
                        if (Penghasilan > 300000000) {
                            totalPajak = totalPajak + (250000000 * 0.15);
                            if (Penghasilan > 800000000) {
                                totalPajak = totalPajak + ((Penghasilan - 500000000) * 0.30);
                            } else {
                                totalPajak = totalPajak + ((Penghasilan - 250000000) * 0.25);
                            }
                        } else {
                            totalPajak = totalPajak + ((Penghasilan - 50000000) * 0.15);
                        }
                    } else {
                        totalPajak = Penghasilan * 0.05;
                    }

                } else {
                    totalPajak = 0;
                }
                System.out.println("Total Pajak : " + totalPajak);
                break;
            case "TK3":
                Penghasilan = Penghasilan - 45000000;
                if (Penghasilan > 0) {

                    if (Penghasilan > 50000000) {
                        totalPajak = totalPajak + (50000000 * 0.05);
                        if (Penghasilan > 300000000) {
                            totalPajak = totalPajak + (250000000 * 0.15);
                            if (Penghasilan > 800000000) {
                                totalPajak = totalPajak + ((Penghasilan - 500000000) * 0.30);
                            } else {
                                totalPajak = totalPajak + ((Penghasilan - 250000000) * 0.25);
                            }
                        } else {
                            totalPajak = totalPajak + ((Penghasilan - 50000000) * 0.15);
                        }
                    } else {
                        totalPajak = Penghasilan * 0.05;
                    }

                } else {
                    totalPajak = 0;
                }
                System.out.println("Total Pajak : " + totalPajak);
                break;
            case "K0":
                Penghasilan = Penghasilan - 39000000;
              if (Penghasilan > 0) {

                    if (Penghasilan > 50000000) {
                        totalPajak = totalPajak + (50000000 * 0.05);
                        if (Penghasilan > 300000000) {
                            totalPajak = totalPajak + (250000000 * 0.15);
                            if (Penghasilan > 800000000) {
                                totalPajak = totalPajak + ((Penghasilan - 500000000) * 0.30);
                            } else {
                                totalPajak = totalPajak + ((Penghasilan - 250000000) * 0.25);
                            }
                        } else {
                            totalPajak = totalPajak + ((Penghasilan - 50000000) * 0.15);
                        }
                    } else {
                        totalPajak = Penghasilan * 0.05;
                    }

                } else {
                    totalPajak = 0;
                }
                System.out.println("Total Pajak : " + totalPajak);
                break;
            case "K1":
                Penghasilan = Penghasilan - 42000000;
                if (Penghasilan > 0) {

                    if (Penghasilan > 50000000) {
                        totalPajak = totalPajak + (50000000 * 0.05);
                        if (Penghasilan > 300000000) {
                            totalPajak = totalPajak + (250000000 * 0.15);
                            if (Penghasilan > 800000000) {
                                totalPajak = totalPajak + ((Penghasilan - 500000000) * 0.30);
                            } else {
                                totalPajak = totalPajak + ((Penghasilan - 250000000) * 0.25);
                            }
                        } else {
                            totalPajak = totalPajak + ((Penghasilan - 50000000) * 0.15);
                        }
                    } else {
                        totalPajak = Penghasilan * 0.05;
                    }

                } else {
                    totalPajak = 0;
                }
                System.out.println("Total Pajak : " + totalPajak);
                break;
            case "K2":
                Penghasilan = Penghasilan - 45000000;
               if (Penghasilan > 0) {

                    if (Penghasilan > 50000000) {
                        totalPajak = totalPajak + (50000000 * 0.05);
                        if (Penghasilan > 300000000) {
                            totalPajak = totalPajak + (250000000 * 0.15);
                            if (Penghasilan > 800000000) {
                                totalPajak = totalPajak + ((Penghasilan - 500000000) * 0.30);
                            } else {
                                totalPajak = totalPajak + ((Penghasilan - 250000000) * 0.25);
                            }
                        } else {
                            totalPajak = totalPajak + ((Penghasilan - 50000000) * 0.15);
                        }
                    } else {
                        totalPajak = Penghasilan * 0.05;
                    }

                } else {
                    totalPajak = 0;
                }
                System.out.println("Total Pajak : " + totalPajak);
                break;
            case "K3":
                Penghasilan = Penghasilan - 48000000;
                if (Penghasilan > 0) {

                    if (Penghasilan > 50000000) {
                        totalPajak = totalPajak + (50000000 * 0.05);
                        if (Penghasilan > 300000000) {
                            totalPajak = totalPajak + (250000000 * 015);
                            if (Penghasilan > 800000000) {
                                totalPajak = totalPajak + ((Penghasilan - 500000000) * 0.30);
                            } else {
                                totalPajak = totalPajak + ((Penghasilan - 250000000) * 0.25);
                            }
                        } else {
                            totalPajak = totalPajak + ((Penghasilan - 50000000) * 0.15);
                        }
                    } else {
                        totalPajak = Penghasilan * 0.05;
                    }

                } else {
                    totalPajak = 0;
                }
                System.out.println("Total Pajak : " + totalPajak);
                break;
            default:
                throw new AssertionError();
        }
    }
}
