package com.bot.tgballbot.domain

import lombok.*
import javax.persistence.*

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
data class Country(
@Id private var code: String = "",
@Column
private var name: String = "",
@Column
private var continent: String = "",
@Column
private var region: String = "",
@Column
private var surfaceArea: Double = 0.0,
@Column
private var indepYear: Int = 0,
@Column
private var population: Int = 0,
@Column
private var lifeExpectancy: Double = 0.0,
@Column
private var GNP: Int = 0,
@Column
private var GNPOld: Int = 0,
@Column
private var localName: String = "",
@Column
private var governmentForm: String = "",
@Column
private var headOfState: String = "",
@Column
private var capital: String = "",
@Column
private var code2: String = "") {
/*    @Id
    private var code: String = ""
    @Column
    private var name: String = ""
    @Column
    private var continent: String = ""
    @Column
    private var region: String = ""
    @Column
    private var surfaceArea: Double = 0.0
    @Column
    private var indepYear: Int = 0
    @Column
    private var population: Int = 0
    @Column
    private var lifeExpectancy: Double = 0.0
    @Column
    private var GNP: Int = 0
    @Column
    private var GNPOld: Int = 0
    @Column
    private var localName: String = ""
    @Column
    private var governmentForm: String = ""
    @Column
    private var ceadOfState: String = ""
    @Column
    private var capital: String = ""
    @Column
    private var code2: String = ""*/

}